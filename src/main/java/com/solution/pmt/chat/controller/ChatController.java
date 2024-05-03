package com.solution.pmt.chat.controller;

import com.solution.pmt.chat.entity.Chat;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    @GetMapping("/home")
    public String chatHome(){
        return "chat/Home";
    }

    @MessageMapping("/{roomId}") //여기로 전송되면 메서드 호출 -> WebSocketConfig prefixes 에서 적용한건 앞에 생략
    @SendTo("/room/{roomId}") // 해당 주소를 구독하고 있는 구독자에게 모두 전송.
    // DestinationVariable : 구독 및 발행 url 의 pathparameter
    public Chat chatting(@DestinationVariable Long roomId,  String message){

        return  null;
    }

}
