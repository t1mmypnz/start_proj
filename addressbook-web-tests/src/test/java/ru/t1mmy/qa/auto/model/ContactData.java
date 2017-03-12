package ru.t1mmy.qa.auto.model;

public class ContactData {
    private final String name;
    private final String lastN;
    private final String nick;
    private final String address;
    private final String mobile;
    private final String email;

    public ContactData(String name, String lastN, String nick, String address, String mobile, String email) {
        this.name = name;
        this.lastN = lastN;
        this.nick = nick;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastN() {
        return lastN;
    }

    public String getNick() {
        return nick;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
