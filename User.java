package com.company;
import java.util.*;

public class User {
    protected String firstName;
    protected String lastName;
    protected String dob;
    protected String password;
    protected String id;

    public User(){}

    public User(String fName, String lName, String bday, String pass){
        this.firstName = fName;
        this.lastName = lName;
        this.dob = bday;
        this.password = pass;
        this.id = makeID(this.firstName, this.lastName, this.dob);
    }

    public String makeID(String fName, String lName, String bday){
        String id;
        char first = fName.charAt(0);
        String date1 = bday.substring(0,2);
        String date2 = bday.substring(3,5);
        id = first + lName + date1 + date2;
        return id;
    }

    public String toString(){
        return "First Name: " + this.firstName +"\n" +
                "Last Name: " + this.lastName + "\n" +
                "Date of Birth: " + this.dob + "\n" +
                "ID: " + this.id + "\n";

    }

    public String getFirst(){
        return this.firstName;
    }

    public void setFirst(String fname){
        this.firstName = fname;
    }

    public String getLast(){
        return this.lastName;
    }

    public void setLast(String lName){
        this.lastName = lName;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }



}


