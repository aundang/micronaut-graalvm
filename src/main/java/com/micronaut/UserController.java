package com.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get("/random")
    public User randomUser() {
        return userService.randomUser();
    }

    @Get("/")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}