package com.project.chatapp.repository;

import com.project.chatapp.common.base.BaseRepository;
import com.project.chatapp.model.ChatRoom;
import com.project.chatapp.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChatRoomRepository extends BaseRepository<ChatRoom, Long> {
    Optional<ChatRoom> findByChatId(String chatId);
    Optional<ChatRoom> findByUser1AndUser2(Users user1, Users user2);
    List<ChatRoom> findByUser1OrUser2(Users user1, Users user2);

}
