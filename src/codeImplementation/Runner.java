package codeImplementation;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Runner {
	

    JFrame frame;
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
		String name;
		String userName;
		String password;
		double[] location = new double[2];
		Boolean hasWatch;
		double weight;
		
		// Construct the Runner object
		public Runner(String name, String userName, String password,
	double[] location, Boolean hasWatch, double weight)
		{
			this.name = name;
			this.userName = userName;
			this.password = password;
			this.hasWatch = hasWatch;
			this.weight = weight;

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

		public void login(String userName, String password)
		{
		System.out.println("Login:   What is your username?");
			if(userName == this.userName)
			{	
				System.out.println("What is your password?");

				boolean loggedIn = false;
				int count = 0;
				while(!loggedIn) {
					
					if(password.equals(this.password))
					{
						System.out.println("Logged in");
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
		
		}

	public static void main(String[] args)
	{
	    
	}
}
