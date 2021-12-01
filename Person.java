package org.itstep;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private int id;
    private String name;
    private String phone;
    private List<String> emails;

    Person(){}

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String toString(){
        return String.format("id: %s, name: %s, phone: %s",id, name, phone);
    }
}
