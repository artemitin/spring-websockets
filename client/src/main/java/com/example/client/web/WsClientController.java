//package com.example.client;
//
//import com.example.client.model.Greeting;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.simp.stomp.StompFrameHandler;
//import org.springframework.messaging.simp.stomp.StompHeaders;
//import org.springframework.messaging.simp.stomp.StompSession;
//import org.springframework.messaging.simp.stomp.StompSessionHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.socket.messaging.WebSocketStompClient;
//
//import java.lang.reflect.Type;
//
//@RestController
//public class WsClientController {
//
//    @Autowired
//    private WebSocketStompClient stompClient;
//
//    @GetMapping("/message")
//    public String sendMessage(@RequestParam("content") String content) {
//        StompSessionHandler sessionHandler = new CustmStompSessionHandler();
//
//        StompSession stompSession = stompClient.connect(loggerServerQueueUrl, sessionHandler).get();
//
//
//        stompSession.subscribe("topic/chatroom", handler);
//
//        stompSession.send("app/chatroom", "Hello: " + content);
//
//        return "OK";
//    }
//
//    private static class CustomFrameHandler implements StompFrameHandler {
//        @Override
//        public Type getPayloadType(StompHeaders headers) {
//            return String.class;
//        }
//
//        @Override
//        public void handleFrame(StompHeaders headers, Object payload) {
//            Message msg = (Message) payload;
//            System.out.println("Received : " + msg.getText()+ " from : " +
//                    msg.getFrom());
//        }
//    }
//}
