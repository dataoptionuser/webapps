//return long gap between binary numbers 0 and 1
package javacode;

public class longgap {

	public static void main(String[] args) {
		solution(1041);
	}

	public static int solution(int N) {
	    	 String binstr = Integer.toBinaryString(N);
	         int len = 0;
	         int maxlen = 0;
	         //System.out.println(binstr);
	         char[] binarr = binstr.toCharArray();
	         for(int i=0; i<binarr.length; i++)
	         {
	             if(i==0)
	             {
	                len = 0;
	                maxlen = 0;
	             }
	             else
	             {
	                 if(binarr[i] == '1')
	                 {
	                    if(binarr[i-1] == '0')
	                    {
	                        //current maxlenght 
	                        if(len > maxlen)
	                        {
	                             maxlen = len;
	                        }
	                        //reset lenght to 0
	                        len = 0;
	                    }
	                 }
	                 else
	                 {
	                     len = len + 1;
	                 }
	             }
	         }
	         return maxlen;
	    }
}
