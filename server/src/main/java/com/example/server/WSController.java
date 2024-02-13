package com.example.server;

import org.example.shared.HelloMessage;
import org.example.shared.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WSController {

    @MessageMapping("/news")
    @SendTo("/topic/news")
    public ResponseMessage broadcastNews(@Payload HelloMessage message) throws Exception {
        Thread.sleep(1000);
        return new ResponseMessage("Reply: " + HtmlUtils.htmlEscape(message.getName()));
    }
}
