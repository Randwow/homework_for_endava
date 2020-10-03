package com.company;
import java.util.ArrayList;
import java.util.*;
import com.company.UserList.*;
import com.company.User.*;
import com.company.*;

public class Main {
    public static void main(String[] args) {
        UserList.addUser("Nichita", "Macheev", 18,"nichita.macheev@gmail.com","New","3.10.2020" );
        UserList.addUser("Xenia", "Miron", 34,"xenia.miron@gmail.com","New","2.10.2020" );
        UserList.addUser("Alina", "Malkova", 21,"alina.malkova@gmail.com","INACTIVE","3.10.2019" );
        UserList.addUser("Alex", "Petrov", 45,"alex.petrov@gmail.com","Active","3.10.2009" );
        System.out.println(UserList.getUser("Nichita","Macheev"));
        System.out.println(UserList.getUser("Xenia","Miron"));
        System.out.println(UserList.getUser("Alina","Malkova"));
        System.out.println(UserList.getUser("Alex","Petrov"));
        System.out.println("\nCall the method that changes the status\n");
        UserList.changeStatus();
        System.out.println(UserList.getUser("Nichita","Macheev"));
        System.out.println(UserList.getUser("Xenia","Miron"));
        System.out.println(UserList.getUser("Alina","Malkova"));
        System.out.println(UserList.getUser("Alex","Petrov"));
        System.out.println("\nCall the method that changes the status INACTIVE on Blocked\n");
        UserList.inactiveMethod();
        System.out.println(UserList.getUser("Nichita","Macheev"));
        System.out.println(UserList.getUser("Xenia","Miron"));
        System.out.println(UserList.getUser("Alina","Malkova"));
        System.out.println(UserList.getUser("Alex","Petrov"));
        UserList.delUser("Macheev");
        UserList.delUser("Miron");
        UserList.delUser("Malkova");
        UserList.delUser("Petrov");
    }
}
