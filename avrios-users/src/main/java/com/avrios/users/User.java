package com.avrios.users;

import java.time.Instant;

public class User {
    private String name;

    private Instant lastLogin;

    public User(String name) {
        this.name = name;

        lastLogin = Instant.now().minusSeconds(3600);
    }

    public String getName() {
        return name;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }
}
