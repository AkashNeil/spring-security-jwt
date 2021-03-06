package io.github.seebaware.lemon.service;

import io.github.seebaware.lemon.domain.Role;
import io.github.seebaware.lemon.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
