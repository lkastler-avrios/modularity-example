package com.avrios.example.service;

import com.avrios.example.domain.User;
import com.avrios.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.stream.Stream;

@Service
public class UserService {

    @Inject
    private UserRepository userRepository;

    public Stream<User> findAll() {
        return userRepository.findAll();
    }

    public User create(String name) {
        if (name == null) {
            throw new IllegalArgumentException("user cannot have name null");
        }

        User user = new User(name);

        return userRepository.save(user);
    }
}
