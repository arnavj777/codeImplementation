package codeImplementation;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

public class Calendar {
	
	
	
	
	
	
	
	
	
	String Temperature;
	String Weather;
	String runningPath;
	
	// set up stats examples
	
	
	Map<Date,Stats> stats = new HashMap<Date, Stats>();
	Map<LocalDateTime, String> notes = new HashMap<LocalDateTime, String>();
		
	
    Iterator StatsIterator = stats.entrySet().iterator();

	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
	
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


