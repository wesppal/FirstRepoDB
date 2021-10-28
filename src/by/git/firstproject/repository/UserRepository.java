package by.git.firstproject.repository;

import by.git.firstproject.entity.User;

public interface UserRepository {

    User[] getAllUsers ();

    User getUserById (long id);

    User getUserByFullName (String fullName);

    User removeUserById (long id);

    User addUser (User user);
}
