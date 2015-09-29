/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if4031;

import io.grpc.stub.StreamObserver;

/**
 *
 * @author M. Reza Irvanda
 */
public class ChatServiceHandler implements ChatServiceGrpc.ChatService {

    @Override
    public void nick(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anonNick(ChatServiceOuterClass.grpcVoid request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void join(ChatServiceOuterClass.nameChannel request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leave(ChatServiceOuterClass.nameChannel request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exit(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receive(ChatServiceOuterClass.name request, StreamObserver<ChatServiceOuterClass.grpcString> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void send(ChatServiceOuterClass.nameChannelMsg request, StreamObserver<ChatServiceOuterClass.grpcBool> responseObserver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
