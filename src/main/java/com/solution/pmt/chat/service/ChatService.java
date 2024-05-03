package com.solution.pmt.chat.service;

import com.solution.pmt.chat.entity.Chat;
import com.solution.pmt.chat.entity.ChatRoom;
import com.solution.pmt.entity.Member;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public static Chat createChat(Member sendMember, String message, ChatRoom chatRoom){
        return Chat.builder()
                //.sendMember(sendMember)
                .message(message)
                .chatRoom(chatRoom)
                .build();
    }

}
