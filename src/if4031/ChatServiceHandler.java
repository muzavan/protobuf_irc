/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if4031;

import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author M. Reza Irvanda
 */
public class ChatServiceHandler implements ChatServiceGrpc.ChatService {
    
    HashMap<String, String> users = new HashMap<String,String>();
    HashMap<String, ArrayList<String>> channels = new HashMap<String, ArrayList<String>>();
    NameGenerator  generator = new NameGenerator();
    
    @Override
    public void nick(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        System.out.println("nick("+request.getUserName()+")");
        String username = request.getUserName();
        if(users.get(username)==null){
            users.put(username, "");
            responseObserver.onNext(ChatServiceOuterClass.grpcString.newBuilder().setValue(username).build());
            responseObserver.onCompleted();
        }
        else{
            responseObserver.onNext(ChatServiceOuterClass.grpcString.newBuilder().setValue(null).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void anonNick(ChatServiceOuterClass.grpcVoid request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        System.out.println("anonNick()");
        String tmp = generator.randomIdentifier();
        users.put(tmp,"");
        responseObserver.onNext(ChatServiceOuterClass.grpcString.newBuilder().setValue(tmp).build());
        responseObserver.onCompleted();
    }

    @Override
    public void join(ChatServiceOuterClass.nameChannel request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        String userName = request.getUserName();
        String channel = request.getChannelName();
        System.out.println("join("+userName+","+channel+")");
        if(channels.get(channel)==null){
            ArrayList<String> participant = new ArrayList<String>();
            participant.add(userName);
            channels.put(channel, participant);
        }
        else{
           channels.get(channel).add(userName);
        }
        responseObserver.onNext(ChatServiceOuterClass.grpcBool.newBuilder().setValue(true).build());
        responseObserver.onCompleted();
    }

    @Override
    public void leave(ChatServiceOuterClass.nameChannel request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
       String userName = request.getUserName();
       String channel = request.getChannelName();
       System.out.println("leave("+userName+","+channel+")");
       if(channels.get(channel)==null){
           responseObserver.onNext(ChatServiceOuterClass.grpcBool.newBuilder().setValue(false).build());
           responseObserver.onCompleted();
       }
       else{
           channels.get(channel).remove(userName);
           responseObserver.onNext(ChatServiceOuterClass.grpcBool.newBuilder().setValue(true).build());
           responseObserver.onCompleted();
       } 
    }

    @Override
    public void exit(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        String userName = request.getUserName();
        System.out.println("exit("+userName+")");
        channels.keySet().stream().forEach((tmpChannel) -> {
            while(channels.get(tmpChannel).remove(userName)){
                // needeed?
            }
        });
        users.remove(userName);
        responseObserver.onNext(ChatServiceOuterClass.grpcBool.newBuilder().setValue(true).build());
        responseObserver.onCompleted();
    }

    @Override
    public void receive(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        String userName = request.getUserName();              
        System.out.println("receive("+userName+")");
        String tmp = users.get(userName);
        users.remove(userName);
        responseObserver.onNext(ChatServiceOuterClass.grpcString.newBuilder().setValue(tmp).build());
        responseObserver.onCompleted();
    }

    @Override
    public void send(ChatServiceOuterClass.nameChannelMsg request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        String message = request.getUserMessage();
        String name = request.getUserName();
        String channel = request.getChannelName();
        System.out.println("send("+message+","+channel+")");
        if(channel.equals("")){
            for(String tmpChannel : channels.keySet()){
                for(String tmpName : channels.get(tmpChannel)){
                    String tmp = users.get(tmpName);
                    tmp = tmp.concat(message+'\n');
                    users.replace(tmpName,tmp);
                }
            }
        }
        else{ 
            for(String tmpName : channels.get(channel)){
                    String tmp = users.get(tmpName);
                    tmp = tmp.concat(message+'\n');
                    users.replace(tmpName,tmp);
            }
        }
        responseObserver.onNext(ChatServiceOuterClass.grpcBool.newBuilder().setValue(true).build());
        responseObserver.onCompleted();
    }
    
    private class NameGenerator{        
        // For generating name, using : http://stackoverflow.com/questions/5025651/java-randomly-generate-distinct-names
        // class variable
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

        final java.util.Random rand = new java.util.Random();

        // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
        final Set<String> identifiers = new HashSet<String>();

        public String randomIdentifier() {
            StringBuilder builder = new StringBuilder();
            while(builder.toString().length() == 0) {
                int length = rand.nextInt(5)+5;
                for(int i = 0; i < length; i++)
                    builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
                if(identifiers.contains(builder.toString())) 
                    builder = new StringBuilder();
            }
            return builder.toString();
      }
    }
}
