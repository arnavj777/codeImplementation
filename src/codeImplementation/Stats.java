package codeImplementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;


public class Stats {

	static double milesGoal;
	static double milesRan;
	static double avgMiles;
	static double totalMiles;
	
	
	Stats()
	{
		milesGoal = 0;
		milesRan = 0;
		avgMiles = 0;
		totalMiles = 0;
	}
	

	public void viewDaily(LocalDateTime date, double miles)
	{
		if (date.isAfter(LocalDateTime.now())) {
			if (date.toLocalDate() != LocalDateTime.)
			System.out.println(getStatsForDay(date, miles));
		}
	}

	public void viewMonthly(LocalDateTime date, double miles)
	{
		System.out.println(getStatsForMonth(date, miles));
	}

	public void viewYearly(LocalDateTime date, double miles)
	{
		System.out.println(getStatsForYear(date, miles));
	}
	
	
	
	
	// getter & Setters
	
	public double getStatsForDay(LocalDateTime date, double miles) {
		
		return milesRan;
	}
	public double getStatsForMonth(LocalDateTime date, double miles) {
		return milesRan;
	}
	public double getStatsForYear(LocalDateTime date, double miles) {
		return milesRan;
	}

}
