//Array A contains only 0s and/or 1s
//
//0 represents a car traveling east,
//1 represents a car traveling west.
//
//  A[0] = 0
//  A[1] = 1
//  A[2] = 0
//  A[3] = 1
//  A[4] = 1
//We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
//
package javacode;

public class passingcars {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,0,1}));

	}
	
    public static int solution(int[] A) {
    	
    	int alen = A.length;
    	int pairs = 0;
    	int incrcount = 1;
    	boolean startadding = false;
    	for(int i=0; i<alen; i++)
    	{
    		int curval = A[i];
    		if (!startadding && curval == 0)
    		{
    			startadding = true;
    		}
    		else if (startadding)
    		{
    			if(curval == 1)
    			{
    				pairs = pairs + incrcount;
    				if(pairs > 1000000000)
    				{
    					return -1;
    				}
    			}
    			else
    			{
    				incrcount = incrcount + 1;
    			}
    			
    		}
    	}
    	
        return pairs;
    }
}
