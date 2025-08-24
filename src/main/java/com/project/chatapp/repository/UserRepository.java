package com.project.chatapp.repository;

import com.project.chatapp.common.base.BaseRepository;
import com.project.chatapp.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    Optional<Users> findByEmail(String email);
    List<Users> findByUsernameContainingIgnoreCase(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
