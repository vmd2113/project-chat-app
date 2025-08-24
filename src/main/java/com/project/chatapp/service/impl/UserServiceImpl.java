package com.project.chatapp.service.impl;

import com.project.chatapp.model.Users;
import com.project.chatapp.repository.UserRepository;
import com.project.chatapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    @Override
    public Users findById(Long id) {
        Optional<Users> user = userRepository.findById(id);
        return user.orElse(null);

    }

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users update(Users entity) {
        if (entity.getId() != null) {
            Optional<Users> user = userRepository.findById(entity.getId());
            if (user.isPresent()) {
                Users userEntity = Users.builder()
                        .email(entity.getEmail())
                        .password(entity.getPassword())
                        .username(entity.getUsername())
                        .build();
                return userRepository.save(userEntity);
            }
        }
        return null;
    }

    @Override
    public Users add(Users entity) {
        return userRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) {
        if (userRepository.existsById(aLong)) {
            userRepository.deleteById(aLong);
        }
    }
}
