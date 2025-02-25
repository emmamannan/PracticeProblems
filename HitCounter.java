package Leetcode;
import java.util.*;

public class HitCounter {
	
	Queue<Integer> hits;

	
	public HitCounter() {
       hits = new LinkedList<Integer>();
    }
    
    public void hit(int timestamp) {
    	this.hits.add(timestamp);
        
    }
    
    public int getHits(int timestamp) {
    	
    	while(!this.hits.isEmpty()) {
    		int difference = timestamp - this.hits.peek();
    		if(difference >= 300) {
    			this.hits.remove();
    		}
    		else {
    			break;
    		}
    	}
    	return this.hits.size();
        
    }

}
