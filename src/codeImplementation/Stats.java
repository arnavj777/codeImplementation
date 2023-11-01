package codeImplementation;

import java.util.Date;

public class Stats {

	static double milesGoal;
	static double milesRan;
	static double avgMiles;
	static double totalMiles;
	
	
	Stats(Double milesGoal, Double milesRan, Double avgMiles, Double totalMiles)
	{
		this.milesGoal = milesGoal;
		this.milesRan = milesRan;
		this.avgMiles = avgMiles;
		this.totalMiles = totalMiles;
	}
	

	public double viewDaily(Date date)
	{
		System.out.println(getStatsForDay(date));
	}

	public double viewMonthly(Date date)
	{
		System.out.println(getStatsForMonth(date));
	}

	public double viewYearly(Date date)
	{
		System.out.println(getStatsForYear(date));
	}
	
	
	
	
	// getter & Setters
	
	public double getStatsForDay() {
		return milesRan;
	}

}
