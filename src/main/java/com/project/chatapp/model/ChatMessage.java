package com.project.chatapp.model;

import com.project.chatapp.common.base.BaseIdentityEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Table(name = "chat_messages")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ChatMessage extends BaseIdentityEntity {
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false)
    private Users sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private Users receiver;

    @Column(name = "is_read")
    private boolean read;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "sent_at", nullable = false)
    private Instant sentAt;


}
