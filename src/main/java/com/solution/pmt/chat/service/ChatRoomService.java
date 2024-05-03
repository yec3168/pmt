package com.solution.pmt.chat.service;

import com.solution.pmt.chat.entity.ChatRoom;

public class ChatRoomService {

    public static ChatRoom createChatRoom(String chatName){
        return ChatRoom.builder()
                .chatName(chatName)
                .build();
    }

}
