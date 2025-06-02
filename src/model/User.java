package model;

import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String bio;
    private List<String> socialMedia;
    private List<Book> books;
    private List<User> followers;
    private List<User> following;
}
