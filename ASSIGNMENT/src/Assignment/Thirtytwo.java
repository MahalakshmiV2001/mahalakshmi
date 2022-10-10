package Assignment;

public class Thirtytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=371;
   int num=0;  
   int p=0;
   int t=0;
   num=n;
   
    while(num!=0) {
    	p=num%10;
    	t=t+p*p*p;
    	num=num/10;
    }
    if(t==n) {
    	System.out.println("The given number is Armstrong number");
    }
    else {
    	System.out.println("The given number is not Armstrong number");
    }
	}
}
