package codeImplementation;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Runner {
	
	String name;
	String userName;
	String password;
	double[] location = new double[2];
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
		public Runner(String name, String userName, String password,
	double[] location, Boolean hasWatch, double weight, Calendar c, double goalMiles)
		{
			this.name = name;
			this.userName = userName;
			this.password = password;
			this.hasWatch = hasWatch;
			this.weight = weight;
			calendar = c;

			if(hasWatch)
			{
				this.location = location;
			}
			else
			{
				this.location[0] = 0.0;
				this.location[1] = 0.0;
			}
		}

		public void login()
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Login:   What is your username?");
			String userName = scan.next();
			if(userName.equals(this.userName))
			{	
				System.out.println("What is your password?");
				String password = scan.next();
				boolean loggedIn = false;
				int count = 0;
				while(!loggedIn) {
					
					if(password.equals(this.password))
					{
						System.out.println("Logged in");
						loggedIn = true;
					}
					else
					{
						System.out.println("Password incorrect");
						count++;
						if(count > 3)
							{
								System.out.println("You've been locked out for 10 minutes");
								//Lock out user for 10 minutes
							}
					}
				}
			}
			else
			{
				System.out.println("This username does not exist");
			}
			scan.close();
		
		}

	public static void main(String[] args)
	{
	    Runner user = new Runner("Billy", "bill5", "ducks", new double[] {2.3, 4.5}, false, 150.7, new Calendar(), 15);
	   // user.login();
	    
	    Scanner scan = new Scanner(System.in);
	    boolean run = true;
	    while(run) {
	    	System.out.println("What data would you like to view? (enter quit to stop program)");
	    	System.out.println("Total Miles Run (1)");
	    	System.out.println("Specific Date (2)");
	    	System.out.println("Average Miles Run (3)");
	    	String line = scan.next();
	    	if(line.equals("quit")) {
	    		run = false;
	    	}
	    	else if(line.toLowerCase().equals("total miles run") || line.equals("1")) {
	    		
	    	}
	    	else if(line.toLowerCase().equals("specific date") || line.equals("2")) {
	    		
	    	}
	    	else if(line.toLowerCase().equals("average miles run") || line.equals("3")) {
	    	}
	    	else {
	    		System.out.println("That was not an option, please enter a choice or quit to exit the program");
	    	}
	    
	    }
	    
	    scan.close();
	}
	
	public String getName() {
		return name;
	}
	
	public void setGoalMiles(double miles) {
		goalMiles = miles;
	}
}
