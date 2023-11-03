package codeImplementation;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

public class Calendar {
	
	
	
	// set up stats examples
	Map<Date,Stats> stats;
	Map<LocalDateTime, String> notes;
		
	
    Iterator StatsIterator = stats.entrySet().iterator();
    
    public Calendar() {
    	stats = new HashMap<Date, Stats>();
    	notes = new HashMap<LocalDateTime, String>();
    }
	
	
	// calcAvgMileGoal() ----> calcAvgMileRan
	public double calcAvgMileRan(LocalDateTime initalDate, LocalDateTime finalDate) {
		double y = 0;
		boolean x = true;
		boolean z = false;
		while (StatsIterator.hasNext() && x ) {
			 
	        Map.Entry mapElement
	            = (Map.Entry)StatsIterator.next();
	        
	        if(mapElement.equals( initalDate)) {
	        	z = true;
	        }
	        if(z) {
	        y = y + (int)mapElement.getValue();
	        }
	        if()
	        
	    }
		return y;
		
	}
	
	
	
 
}


