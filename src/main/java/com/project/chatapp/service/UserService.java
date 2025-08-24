package com.project.chatapp.service;

import com.project.chatapp.common.base.BaseService;
import com.project.chatapp.model.Users;
import com.project.chatapp.repository.UserRepository;

public interface UserService extends BaseService<Users, UserRepository, Long> {
}
