package com.solution.pmt.chat.entity;

import com.solution.pmt.entity.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "chat_id")
    private Long id;

    // 단순히 Member을 연결할지 -> 사진, 이메일 다 가져와야함.
    // 이메일을 저장해서 이메일 찾기로 할지 정해야 할 듯.
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member sendMember; // 보내는 사람 이름.

//    private String senderEmail; // 보내는 사람 이메일.

    @Column(columnDefinition = "TEXT")
    private String message;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime sendDate; // 보내는 시간. 수정 불가능.

    // 채팅방
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatRoom_id")
    private ChatRoom chatRoom;

    @Builder
    public Chat(Member sendMember, String senderEmail, String message, ChatRoom chatRoom){
        //this.sendMember =sendMember;
        this.message = message;
        this.sendDate = LocalDateTime.now();
        this.chatRoom = chatRoom;
    }

}
