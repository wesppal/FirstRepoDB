package by.git.firstproject.service;

import by.git.firstproject.entity.User;

public interface UserService {

    User[] getAllUsers();

    User removeUserById(long id);

    User addUser(String name, String surname, int age, String phoneNumber);

    User getUserById(long id);

    User getUserByFullName(String fullName);
}
