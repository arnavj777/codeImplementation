/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.csclass.implementation;

import java.util.HashMap;
import java.util.Map;

import com.csclass.implementation.Runner;

/**
 *
 * @author arnav
 */
public class Implementation {
    
    
    
    public static void main(String[] args) {
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(Login.loginVisibility);
                
                
            }
        });
    }
}
