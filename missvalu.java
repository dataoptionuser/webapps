//Find the missing element in a given permutation

package javacode;

import java.util.Arrays;

public class missvalu {

	public static void main(String[] args) {	
		System.out.println(solution(new int[]{1,2,3}));
	}
	
	   public static int solution(int[] A) {
	        int missval = 0;
	        int startval = 0;
	        
	        if(A.length == 0)
	        {
	        	return 1;
	        }
	        
	        
	        Arrays.sort((A));

	        for(int i= 0; i< A.length; i++)
	        {
	             if(i==0)
	             {
	                 startval = A[i];	                 
	                 
	             }
	             else{
	                 if(A[i] > A[i-1]+1)
	                 {
	                     missval = A[i]-1;
	                     break;
	                 }
	             }
	        }
	        
	        if(A.length == 1)
	        {
	        	missval = A[0] + 1;
	        }
	        
	        return missval;
	    }
}
