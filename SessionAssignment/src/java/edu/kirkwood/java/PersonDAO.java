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
public interface PersonDAO {
    
    Person getPersonByUserNameAndPassword(String userName, String password);
    
}
