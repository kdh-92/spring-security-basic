package com.codestates.security.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    private LocalDateTime createdAt = LocalDateTime.now();

    private String provider;
    private String providerId;

    @Builder
    public Member(String username, String email, String role, String provider, String providerId) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
    }
}