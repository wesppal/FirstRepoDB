package by.git.firstproject.service.impl;

import by.git.firstproject.entity.User;
import by.git.firstproject.repository.UserRepository;
import by.git.firstproject.repository.impl.UserRepositoryImpl;
import by.git.firstproject.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();


    @Override
    public User[] getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User removeUserById(long id) {
        User[] users = getAllUsers();

        for (User user : users) {
            if (user.getId() == id) {
                return userRepository.removeUserById(id);
            }
        }
        return new User();
    }

    @Override
    public User addUser(String name, String surname, int age, String phoneNumber) {
        User user = new User();
        name = name.trim();
        user.setName(name);
        surname = surname.trim();
        user.setSurname(surname);
        age = Math.abs(age);
        user.setAge(age);

        if (phoneNumber.startsWith("+")) {
            phoneNumber = phoneNumber.substring(0, 13);
            user.setPhoneNumber(phoneNumber);
        } else {
            phoneNumber = "+" + phoneNumber;
            user.setPhoneNumber(phoneNumber);
        }

        userRepository.addUser(user);
        return user;
    }

    @Override
    public User getUserById(long id) {
        User[] users = getAllUsers();

        for (User user : users) {
            if (user.getId() == id) {
                return userRepository.getUserById(id);
            }
        }
        return new User();
    }

    @Override
    public User getUserByFullName(String fullName) {
        String[] name;
        name = fullName.split("\\s");

        if (name.length > 2) {
            return new User();
        }

        User user = userRepository.getUserByFullName(fullName);
        return user;
    }
}
