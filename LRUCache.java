package Leetcode;
import java.util.*;

public class LRUCache {
	
	int capacity;
	HashMap<Integer, Integer> cacheMap;
    ArrayList<Integer> arr;


    public LRUCache(int capacity) {
    	this.capacity = capacity;
        cacheMap = new HashMap<>();
        arr = new ArrayList<>(capacity);

    }
    
    public int get(int key) {
    	
    	Integer result = cacheMap.get(key);
    	if (result == null)
    	{
    		return -1;
    	}
    	
    	arr.remove(Integer.valueOf(key));
    	arr.add(Integer.valueOf(key));
    	
    	return result.intValue();     
    }
    
    public void put(int key, int value) {
    	
    	if (cacheMap.size() == capacity && !cacheMap.containsKey(key)) {
    		
    		cacheMap.remove(arr.get(0));
    		
        	arr.add(Integer.valueOf(key));
        	
        	cacheMap.put(key, value);
    		
    	}
    	
    	else if(cacheMap.containsKey(key)) {
    		cacheMap.put(key, value);
    		
    		arr.remove(Integer.valueOf(key));
        	arr.add(Integer.valueOf(key));
    	}
    	
    	else if(!cacheMap.containsKey(key)) {
    		
    		cacheMap.put(key, value);
    		
        	arr.add(Integer.valueOf(key));
    	}
    	
    }

}
