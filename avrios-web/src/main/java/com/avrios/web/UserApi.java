package com.avrios.web;

import com.avrios.users.User;
import com.avrios.users.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.stream.Stream;

@RestController
@RequestMapping("/users")
public class UserApi {
    @Inject
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Stream<User> getUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestParam(name = "name") String name) {
        return userService.create(name);
    }
}
