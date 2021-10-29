package by.git.firstproject.utils;

import by.git.firstproject.entity.User;

public class UserWrapper {
    public static User stringToUser(String userStr) {
        User user = new User();
        String[] properties = userStr.split(", ");

        for (String str : properties) {

            String prop = str.substring(0, str.indexOf(" "));

            switch (prop) {
                case "id:":
                    long id = Long.parseLong(str.substring(4));
                    break;
                case "name:":
                    String name = str.substring(6);
                    user.setName(name);
                case "surname:":
                    String surname = str.substring(9);
                    break;
                case "age:":
                    int age = Integer.parseInt(str.substring(5));
                    break;
                case "phoneNumber:":
                    String phoneNumber = str.substring(13);
                    user.setPhoneNumber(phoneNumber);
                    break;
            }
        }
        return user;
    }
}
