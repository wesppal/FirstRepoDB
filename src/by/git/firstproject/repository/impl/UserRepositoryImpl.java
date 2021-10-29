package by.git.firstproject.repository.impl;

import by.git.firstproject.DB;
import by.git.firstproject.entity.User;
import by.git.firstproject.repository.UserRepository;
import by.git.firstproject.utils.UserWrapper;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User[] getAllUsers() {
        List<User> users = new ArrayList<>();
        for (String strUser : DB.users) {
            users.add(UserWrapper.stringToUser(strUser));
        }
        return users.toArray(new User[0]);
    }

    @Override
    public User getUserById(long id) {
        User user = new User();
        String idProp = "id: " + id + ",";
        for (int i = 0; i < DB.users.size(); i++) {
            if (DB.users.get(i).startsWith(idProp)) {
                user = UserWrapper.stringToUser(DB.users.get(i));
            }
        }
        return user;
    }

    @Override
    public User getUserByFullName(String fullName) {
        User[] users = getAllUsers();
        User user = new User();
        String[] name;

        name = fullName.split("\\s");
        String fullNameProp = "name: " + name[0] + ", surname: " + name[1] + ", ";

        for (int i = 0; i < users.length; i++) {
            if (users[i].toString().contains(fullNameProp)) {
                user = users[i];
            }
        }
        return user;
    }

    @Override
    public User removeUserById(long id) {
        String idProp = "id: " + id + ",";

        for (String strUser : DB.users) {
            if (strUser.startsWith(idProp)) {
                DB.users.remove(strUser);
                return UserWrapper.stringToUser(strUser);
            }
        }
        return new User();
    }

    @Override
    public User addUser(User user) {
        User.setCounterId(User.getCounterId() + 1);
        user.setId(User.getCounterId());
        DB.users.add(user.toString());
        return user;
    }
}
