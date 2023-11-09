/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csclass.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arnav
 */
public class Runner {
    String name;
    String userName;
    String password;
    double [] location;
    
    double weight;
    
   static boolean loggedIn;
    
    
    static Map<String, String> usernamePasswordMap = new HashMap<>();

    
    public Runner(String name, String userName, String password, double[] location, Boolean hasWatch, double weight) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.weight = weight;

        if(hasWatch){
                this.location = location;
        }

        
        
        
    }
    
    
    public static void login(String userName, String password) {
        // Adding usernames and passwords to the hashmap
        usernamePasswordMap.put("user1", "password123");
        usernamePasswordMap.put("user2", "securePass");
        usernamePasswordMap.put("user3", "123456");
        
         if (usernamePasswordMap.containsKey(userName)) {
            String storedPassword = usernamePasswordMap.get(userName);
            if (storedPassword.equals(password)) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found.");
        }
    }
    
    
}
