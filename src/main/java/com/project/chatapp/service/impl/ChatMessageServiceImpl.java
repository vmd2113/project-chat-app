package com.project.chatapp.service.impl;

import com.project.chatapp.model.ChatMessage;
import com.project.chatapp.repository.ChatMessageRepository;
import com.project.chatapp.service.ChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageServiceImpl implements ChatMessageService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;


    @Override
    public ChatMessageRepository getRepository() {
        return chatMessageRepository;
    }

    @Override
    public ChatMessage findById(Long aLong) {
        if(chatMessageRepository.existsById(aLong)){
            return chatMessageRepository.findById(aLong).get();
        }
        return null;
    }

    @Override
    public List<ChatMessage> findAll() {
        return chatMessageRepository.findAll();
    }

    @Override
    public ChatMessage update(ChatMessage entity) {
        return null;
    }

    @Override
    public ChatMessage add(ChatMessage entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {
        if (chatMessageRepository.existsById(aLong)) {
            chatMessageRepository.deleteById(aLong);
        }
    }
}
