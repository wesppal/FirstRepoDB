package by.git.firstproject.entity;

public class User {

    private long id;
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    private static long counterId = 0;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void setCounterId(long counterId) {
        User.counterId = counterId;
    }

    public static long getCounterId(){
        return counterId;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", phoneNumber: " + phoneNumber;
    }
}
