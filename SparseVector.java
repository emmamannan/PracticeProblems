package Leetcode;
import java.util.*;
public class SparseVector {
	
	HashMap<Integer, Integer> numsMap = new HashMap<>();
	
	SparseVector(int[] nums) {

		for(int i = 0; i < nums.length; i ++)
		{
			if(nums[i] != 0) {
				numsMap.put(i, nums[i]);
			}
		}

    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
    	
    	int sum = 0;
    	
    	for(Integer key : this.numsMap.keySet()) {
    		if(vec.numsMap.containsKey(key)) {
    			sum = sum + (this.numsMap.get(key) * vec.numsMap.get(key));
    		}
    	}

    	return sum;
        
    }

}
