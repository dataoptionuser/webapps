//find the missing smallest positive integer
package javacode;

import java.util.Arrays;

public class smallint {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{-2-4}));

	}
	
    public static int solution(int[] A) {
    	int alen = A.length;
    	int compvalue = 1;
    	Arrays.sort(A);
    	boolean firstpos = true;
    	boolean posfound = false;
    	
    	for(int i=0; i<alen; i++)
    	{
    		int currval = A[i];
    		if (currval > 0) {
    			if(firstpos)
    			{
    				if(currval != 1)
    				{
    					return 1; //is missing
    				}
    				firstpos = false;
    				posfound = true;
    			}
    			else if(A[i-1] + 1 != currval)
    			{
    				if(A[i-1] == currval)
    				{
    					//do nothing
    				}
    				else
    				{	//return missing value
    					return A[i-1]+1;
    				}
    			}
    		}
    	}
    	
    	//of positive value found
    	// and compvalue is one
    	// check for last pos value and add 1 as missing
    	if(posfound && compvalue == 1)
    	{
    		compvalue = A[alen-1]+1 ;
    	}

    		
        return compvalue;
    }
}
