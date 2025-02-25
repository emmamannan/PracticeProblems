package leetcode;
import java.util.*;


public class DataStream {
//	int[] dataStream;
	int counter;
	int value;
	int k;
	
	public DataStream(int value, int k) {
		
//		dataStream = new int[k];
//		for(int i = 0; i < k; i++)
//		{
//			dataStream[i] = 0;
//		}
		this.counter = 0;
		this.value = value;
		this.k = k;
        
    }
    
    public boolean consec(int num) {
    	
//    	for(int i = 0; i < k-1; i++)
//    	{
//    		dataStream[i] = dataStream[i+1];
//    	}
//    	dataStream[k-1] = num;
    	
    	
    	if(num == value)
    	{
    		this.counter++;
    	}
    	else {
    		this.counter = 0;
    	}
    	
    	
    	if(counter >= k)
    	{
    		return true;
    	}
    	return false;
    	
    	
        
    }

}
