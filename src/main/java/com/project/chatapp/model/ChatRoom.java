package com.project.chatapp.model;

import com.project.chatapp.common.base.BaseIdentityEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Table(name = "chat_room")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoom extends BaseIdentityEntity {

    @Column(nullable = false, unique = true)
    private String chatId;

    @ManyToOne
    @JoinColumn(name = "user1_id", nullable = false)
    private Users user1;

    @ManyToOne
    @JoinColumn(name = "user2_id", nullable = false)
    private Users user2;

    @Column(name = "created_at")
    private Instant createdAt;


}
