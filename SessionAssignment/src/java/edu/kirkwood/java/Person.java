/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kirkwood.java;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Sean Geraets
 */
public class Person implements Serializable{
   
    private String userName;
    
    private String firstName;
    
    private String lastName;
    
    private String emailAddress;
    
    private String fact1;
    
    private String fact2;
    
    private String fact3;
    
    private ArrayList<String> facts;

    public Person(String userName, String firstName, String lastName, String emailAddress, String fact1, String fact2, String fact3) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        facts = new ArrayList<String>();
        this.facts.add(fact1);
        this.facts.add(fact2);
        this.facts.add(fact3);
    }

    public Person() {
        this.userName = "";
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = "";
        this.fact1 = "";
        this.fact2 = "";
        this.fact3 = "";
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<String> getFacts() {
        return facts;
    }

    public void setFacts(ArrayList<String> facts) {
        this.facts = facts;
    }
    
    
}
