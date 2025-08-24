package com.project.chatapp.service;

import com.project.chatapp.common.base.BaseService;
import com.project.chatapp.model.ChatMessage;
import com.project.chatapp.repository.ChatMessageRepository;

public interface ChatMessageService extends BaseService<ChatMessage, ChatMessageRepository, Long> {
}
