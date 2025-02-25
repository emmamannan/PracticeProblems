package Leetcode;

public class Bank {
	int n;
	long[] balance;
	
	public Bank(long[] balance) {
		
		this.n = balance.length;
		this.balance = balance;
        
    }
    
    public boolean transfer(int account1, int account2, long money) {
    	if(account1 >= 1 && account1 <= n && account2 >= 1 && account2 <= n) {
    		int index1 = account1 - 1;
    		int index2 = account2 -1; 
    		if(balance[index1] >= money) {
    			balance[index1] = balance[index1] - money;
    			balance[index2] = balance[index2] + money;
    			return true;
    		}
    	}
    	return false;
        
    }
    
    public boolean deposit(int account, long money) {
    	
    	if(account >= 1 && account <= n) {
    		balance[account - 1] = balance[account - 1] + money;
    		return true;
    	}
    	return false;
        
    }
    
    public boolean withdraw(int account, long money) {
    	if(account >= 1 && account <= n && balance[account - 1] >= money) {
    		balance[account - 1] = balance[account - 1] - money;
    		return true;
    	}
    	return false;
    }

}
