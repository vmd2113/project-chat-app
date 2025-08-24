package com.project.chatapp.repository;

import com.project.chatapp.common.base.BaseRepository;
import com.project.chatapp.model.ChatMessage;
import com.project.chatapp.model.ChatRoom;
import com.project.chatapp.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends BaseRepository<ChatMessage, Long> {


    List<ChatMessage> findBySenderAndReceiverOrderBySentAtDesc(Users sender, Users receiver);
    long countBySenderAndReceiverAndReadFalse(Users sender, Users receiver);

}
