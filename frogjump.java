/ Given X as initial pos
// Y as destination pos
//D as one jump distance
//calc minimal jumps needed to go from X to Y
package javacode;

public class frogjump {

	public static void main(String[] args) {
		System.out.println("Jumps :" + solution(1,1,3));
	}
	
    public static int solution(int X, int Y, int D) {
    	
    	//if initial pos > destination pos then zero jumps
    	if(X >= Y)
    	{
    	  return 0;
    	}
    	
    	//if initial position plus first jump greater then dest pos then return 1
    	if(X+D > Y)
    	{
    		return 1;
    	}
    	
    	int jumps = (Y-X)/D;
    	
    	//if remainder is not zero then we need to add one more jump to get over Y
    	if((Y-X)%D != 0)
    	{
    		jumps+=1;
    	}
    	
        return jumps;
    }
}
