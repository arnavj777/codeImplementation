package codeImplementation;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

public class Calendar {
	// set up stats examples
	
	
	Map<Date,Stats> stats;
	Map<LocalDateTime, String> notes;
	
	Stats stat1;
	Stats stat2;
	Stats stat3;
	Stats stat4;
	Stats stat5;
	
	
		
	
    Iterator StatsIterator = stats.entrySet().iterator();

	
	public Calendar() {
		
		DateTimeFormatter formatter
        = DateTimeFormatter.ofPattern(
            "yyyy-MM-dd");
		
		stats = new HashMap<Date, Stats>();
		notes = new HashMap<LocalDateTime, String>();
		
		stats.put(2023-03-11, stat1);
	}
	
	public double calcAvgMileRan(LocalDateTime initalDate, LocalDateTime finalDate) {
		double y = 0;
		boolean x = true;
		boolean z = false;
		int count = 0;
		while (StatsIterator.hasNext() && x ) {
			 
	        Map.Entry mapElement
	            = (Map.Entry)StatsIterator.next();
	        
	        if(mapElement.equals( initalDate)) {
	        	z = true;
	        }
	        if(z) {
	        y = y + (int)mapElement.getValue();
	        }
	        if(mapElement.equals( finalDate)) {
	        	z = false;
	        }
	        count++;
	        
	        
	    }
		return (y/count);
		
	}
	
	public double calcTotalMilesRan(LocalDateTime initalDate, LocalDateTime finalDate) {
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
	        if(mapElement.equals( finalDate)) {
	        	z = false;
	        }
	        
	    }
		return y;
		
	}
	
	
	
 
}


