package Assignment;

public class Twentyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=32;
       int n2=30;
       int lcm;
       lcm=n1>n2?n1:n2;
       while(true) {
    	   if(lcm%n1==0&&lcm%n2==0) {
    		   System.out.println("lcm of "+n1+" and " +n2+" is "+lcm);
    	   		break;
       }
       ++lcm;
       }
       }
}       
        
       
     /*  int max=0;
       int lcm;
       max=n1>n2?n1:n2;                                 
      while(true) {
    	if((max%n1==0) && (max%n2==0)){
    		lcm=max;
    	      break;	
    	}
    	max++;
      }
     System.out.println(lcm);
     */

	/*

*/