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

	public double updateRunnerGoal(String runnerName, Timestamp spec, Double milesGoal)
	{
		Runner thisRunner;
		for(Runner run : assignedRunners) {
			if(run.getName().equals(runnerName))
			thisRunner = run;
		}
		thisRunner.updateMilesGoal(milesGoal);
		Runner.getRunner(runnerName).Calendar.updateNotes(spec, "Updated Goal");
		
	}

}
