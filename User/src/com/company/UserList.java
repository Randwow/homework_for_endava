package com.company;
import java.util.*;
public class UserList {
    private static List<User> myList = new ArrayList<>();
    public static User getUser(String firstname, String lastname) {
        for(User u : myList)
            if(u.getFirstname().equals(firstname) && u.getLastname().equals(lastname))
                return u;
        return null;
    }
    public static void addUser(String firstname, String lastname, int age, String email, String status, String timestamp){
        if(getUser(firstname, lastname) == null)
            myList.add(new User(firstname, lastname, age, email, status, timestamp));
        else
            System.out.println("Такой пользователь уже существует!");
    }
    public static void delUser(String lastname) {
        if(!myList.isEmpty()) {
            Iterator<User> iter = myList.iterator();
            while(iter.hasNext()) {
                User u = iter.next();
                if(u.getLastname().equals(lastname))
                    iter.remove();
            }
        }
        else
            System.out.println("Список пользователей пуст!");
    }
    public static void changeStatus(){
        if(myList.isEmpty()){
            System.out.println("Список пользователей пуст!");
        }else{
            Iterator<User> iter = myList.iterator();
            while(iter.hasNext()) {
                User u = iter.next();
                if(u.getTimestamp().equals("3.10.2020")){ u.setStatus("New");}
                if((u.getTimestamp().compareTo("3.10.2020") < 0)&& u.getStatus().equals("New")){ u.setStatus("Active ");}
            }
        }
    }
    public static void inactiveMethod(){
        if(myList.isEmpty()){
            System.out.println("Список пользователей пуст!");
        }else{
            Iterator<User> iter = myList.iterator();
            while(iter.hasNext()) {
                User u = iter.next();
                if((u.getTimestamp().compareTo("3.9.2020") < 0) && u.getStatus().equals("INACTIVE")){ u.setStatus("Blocked ");}
            }
        }
    }
}
