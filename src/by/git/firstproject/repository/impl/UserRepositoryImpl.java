package by.git.firstproject.repository.impl;

import by.git.firstproject.entity.User;
import by.git.firstproject.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User[] getAllUsers() {
        return new User[0];
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User getUserByFullName(String fullName) {
        return null;
    }

    @Override
    public User removeUserById(long id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
