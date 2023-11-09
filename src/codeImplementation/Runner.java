package codeImplementation;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Runner {
	
	String name;
	String userName;
	String password;
	double[] location;
	Boolean hasWatch;
	double weight;
    JFrame frame;
    Calendar calendar;
    double goalMiles;
    
    Runner(){
    frame=new JFrame("first way");
    JButton button = new JButton("let's see");
    button.setBounds(200, 150, 90, 50);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(button);
    frame.setSize(500, 600);
    
    
    frame.setLayout(null);
     
    // makes the frame visible
    frame.setVisible(true);
    }
		// Initialize variables for the class itself
		
		
		// Construct the Runner object

}
