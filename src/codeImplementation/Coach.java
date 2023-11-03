package codeImplementation;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Coach extends Runner{
	ArrayList<Runner> assignedRunners;
	
	public Coach(ArrayList<Runner> runners)
	{
		for(Runner r : runners) {
			assignedRunners.add(r);
		}
	}

	public void updateRunnerGoal(String runnerName, Timestamp spec, Double milesGoal)
	{
		for(Runner run : assignedRunners) {
			if(run.getName().equals(runnerName)) {
				Runner thisRunner = run;
				thisRunner.setGoalMiles(milesGoal);
			}
			
		}
		
		
		//Runner.getRunner(runnerName).Calendar.updateNotes(spec, "Updated Goal"); 
		
	}

}
