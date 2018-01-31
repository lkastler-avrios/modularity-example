package com.avrios.web;

import com.avrios.drivers.DriverRepository;
import com.avrios.drivers.DriverService;
import com.avrios.users.UserRepository;
import com.avrios.users.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public DriverService driverService() {
        return new DriverService();
    }

    @Bean
    public DriverRepository driverRepository() {
        return new DriverRepository();
    }
}
