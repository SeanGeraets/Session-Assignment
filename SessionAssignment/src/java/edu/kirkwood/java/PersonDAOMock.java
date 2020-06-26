/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kirkwood.java;

/**
 *
 * @author Sean Geraets
 */
public class PersonDAOMock implements PersonDAO{
    
    @Override
    public Person getPersonByUserNameAndPassword(String userName,
             String password) {
        Person person = null;
        if (userName.equals("alpha") && password.equals("apple")) {
            person = new Person(userName, "Joe", "Smith", "joe.smith@gmail.com", "Allergic to peanuts", "Lactose Intolerant", "Likes baseball");
        }
        if(userName.equals("beta") && password.equals("banana")){
            person = new Person(userName, "Jane", "Doe", "jane.doe@gmail.com", "colorblind", "veteran", "dog owner");
        }
        if(userName.equals("gamma") && password.equals("grape")){
            person = new Person(userName, "Oliver", "Queen", "oliver.queen@gmail.com", "Likes Archery", "Likes to exercise", "Has two kids");
        }
        return person;
    }
    
}
