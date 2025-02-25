package Leetcode;
import java.util.*;
public class MyCalendar {
	
	TreeMap<Integer, Integer> calendar;
	
	public MyCalendar() {

		calendar = new TreeMap<>();
		
    }
    
    public boolean book(int startTime, int endTime) {
    	if(calendar.isEmpty()) {
    		calendar.put(startTime, endTime);
    		return true;
    	}
    	
    	Integer prev = calendar.floorKey(startTime);
    	Integer next = calendar.ceilingKey(endTime);
    	
    	if((prev == null || calendar.get(prev) <= startTime) && (next == null || endTime <= next)) {
    		calendar.put(startTime, endTime);
    		return true;
    	}
    	return false;
    	
        
    }

}
