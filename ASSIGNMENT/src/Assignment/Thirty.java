package Assignment;

public class Thirty {

	public static void main(String[] args) {   // Binary to decimal
		// TODO Auto-generated method stub
       int num=1010;
       int n,i=0;
       double b,sum=0;
       while(num>0) {
    	  double a=Math.pow(2,i);
    	  n=num%10;
    	   b=n*a;
    	   System.out.println(b);                                                                                                                      
    	   num=num/10;
    	   sum=sum+b;
      	  
    	   i++;
       }
       System.out.println(sum);
	}

}
