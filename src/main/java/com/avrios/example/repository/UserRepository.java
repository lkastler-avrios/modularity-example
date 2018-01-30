package com.avrios.example.repository;

import com.avrios.example.domain.User;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.stream.Stream;

@Repository
public class UserRepository {

    private Map<String, User> users;

    @PostConstruct
    private void init() {
        users = Maps.newHashMap(Maps.asMap(Sets.newHashSet("Peter", "Roger"), User::new));
    }

    public Stream<User> findAll() {
        return users.values().stream();
    }

    public User save(User user) {
        users.put(user.getName(), user);
        return user;
    }
}
