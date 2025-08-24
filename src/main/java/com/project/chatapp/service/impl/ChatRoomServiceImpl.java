package com.project.chatapp.service.impl;

import com.project.chatapp.model.ChatRoom;
import com.project.chatapp.repository.ChatRoomRepository;
import com.project.chatapp.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Override
    public ChatRoomRepository getRepository() {
        return chatRoomRepository;
    }

    @Override
    public ChatRoom findById(Long aLong) {
        return null;
    }

    @Override
    public List<ChatRoom> findAll() {
        return chatRoomRepository.findAll();
    }

    @Override
    public ChatRoom update(ChatRoom entity) {
        return null;
    }

    @Override
    public ChatRoom add(ChatRoom entity) {
        return chatRoomRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) {
        if (chatRoomRepository.existsById(aLong)) {
            chatRoomRepository.deleteById(aLong);
        }

    }
}
