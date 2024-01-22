package org.example.tsk_5;

import javax.xml.namespace.QName;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;



public class Main {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("Max", 27));

        users.add(new User("Veronika", 20));

        users.add(new User("Denis", 30));

        users.add(new User("Max", 27));



        if (users.size() == 3) {

            System.out.println("System works well!");

        } else {

            throw new RuntimeException("Users set size should be 3!");

        }

    }

}

