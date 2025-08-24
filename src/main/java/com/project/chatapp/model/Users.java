package com.project.chatapp.model;

import com.project.chatapp.common.base.BaseEntity;
import com.project.chatapp.common.base.BaseIdentityEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;


@Table(name = "users")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users extends BaseIdentityEntity {

    private String username;

    private String password;

    private String email;

    private Instant lastOnlineAt;

    private Instant lastSeenAt;


}
