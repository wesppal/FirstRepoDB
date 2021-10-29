package by.git.firstproject;

import by.git.firstproject.entity.User;
import by.git.firstproject.service.UserService;
import by.git.firstproject.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        User removedUser = userService.removeUserById(1);
        User userById = userService.getUserById(2);
        User userByFullName = userService.getUserByFullName("Ivan Kirkorov");
        User userAdd = userService.addUser("Sergei", "Nikolaev", 42, "+123456789101");
        User userAdd2 = userService.addUser("Nikolai ", "Sergeev ", -24, "+12345678910111");
        User removedUser2 = userService.removeUserById(10);

        if (removedUser.getId() > 0) {
            System.out.println("Removed user:\n" + removedUser + "\n");
        } else {
            System.out.println("User not found");
        }


        if (userByFullName.getId() > 0) {
            System.out.println("Search user by full name:\n" + userByFullName + "\n");
        } else {
            System.out.println("User not found");
        }


        if (userById.getId() > 0) {
            System.out.println("Search user by id:\n" + userById + "\n");
        } else {
            System.out.println("User not found");
        }

        System.out.println("Add new user:\n" + userAdd + "\n");

        if (removedUser.getId() > 0) {
            System.out.println("Removed user:\n" + removedUser2 + "\n");
        } else {
            System.out.println("User not found");
        }

        System.out.println("Add new user:\n" + userAdd2 + "\n");

        User[] users = userService.getAllUsers();

        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
    }
}
