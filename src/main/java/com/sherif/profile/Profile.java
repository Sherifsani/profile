package com.sherif.profile;

public class Profile {
    private String email;
    private String name;
    private String stack;

    public Profile(String email, String name, String stack) {
        this.email = email;
        this.name = name;
        this.stack = stack;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
