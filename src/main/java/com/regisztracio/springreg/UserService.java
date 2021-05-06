package com.regisztracio.springreg;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
