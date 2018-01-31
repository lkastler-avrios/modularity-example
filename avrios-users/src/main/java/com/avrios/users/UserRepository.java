package com.avrios.users;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.stream.Stream;

import static com.google.common.collect.Sets.newHashSet;

@Repository
public class UserRepository {

    private Map<String, User> users;

    @PostConstruct
    private void init() {
        users = Maps.newHashMap(Maps.asMap(newHashSet("Peter", "Roger"), User::new));
    }

    public Stream<User> findAll() {
        return users.values().stream();
    }

    public User save(User user) {
        users.put(user.getName(), user);
        return user;
    }
}
