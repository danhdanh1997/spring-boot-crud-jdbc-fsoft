package xuandanh.spring.service;

import xuandanh.spring.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}