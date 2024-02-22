package com.example.server.web;

import com.example.server.service.DataService;
import org.example.shared.HelloMessage;
import org.example.shared.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WSController {

    @Autowired
    private DataService dataService;

    @MessageMapping("/chatroom")
    @SendTo("/topic/chatroom")
    public ResponseMessage broadcast(@Payload HelloMessage message) throws Exception {
        System.out.println("message received: " + message);
        System.out.println(dataService.toString());
        Thread.sleep(1000);
        return new ResponseMessage("Reply: " + HtmlUtils.htmlEscape(message.getContent()));
    }
}
