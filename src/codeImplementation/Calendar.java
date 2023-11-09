package codeImplementation;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Calendar {
	// set up stats examples
	
	
	Map<Date,Stats> stats;
	Map<Date , String> notes;
	
	Stats stat1;
	Stats stat2;
	Stats stat3;
	Stats stat4;
	Stats stat5;
	
	
		

	
	@SuppressWarnings("deprecation")
	 Calendar() {



		Map<Date,Stats> stat = new HashMap<Date , Stats>();
		Map<Date , String> note = new HashMap<Date , String>();
		
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2023, 11, 03);
		Date date2 = new Date(2023, 11, 03);

		
		stat.put(date1, stat1);
		stat.put(date2, stat2);

	}

	
	public double calcAvgMileRan(Date  initalDate, Date  finalDate) {
		double y = 0;
		boolean x = true;
		boolean z = false;
		int count = 0;
		Iterator StatsIterator = stats.entrySet().iterator();

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
	
	public double calcTotalMilesRan(Date  initalDate, Date  finalDate) {
		double y = 0;
		boolean x = true;
		boolean z = false;
		Iterator StatsIterator = stats.entrySet().iterator();

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


