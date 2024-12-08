package org.example.ZooTask17;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo email addresses are allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Password must be longer than 6 characters and cannot contain the username.");
        }
    }

    public void displayUserInfo() {
        System.out.println("User Email: " + email);
        System.out.println("Username: " + userName);
    }
}