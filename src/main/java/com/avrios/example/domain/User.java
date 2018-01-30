package com.avrios.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
public class User {
    private String name;

    private Instant lastLogin;

    public User(String name) {
        this.name = name;

        lastLogin = Instant.now().minusSeconds(3600);
    }
}
