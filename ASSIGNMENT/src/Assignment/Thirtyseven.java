package Assignment;

public class Thirtyseven {

	public static void main(String[] args) {     //to find spy number or not
		// TODO Auto-generated method stub
   int n=123;
   int sum=0;
   int prod=1;
   int lastdigit;
   
   while(n>0) {
	   lastdigit=n%10;
	   sum=sum+lastdigit;
	   prod=prod*lastdigit;
	   n=n/10;
   }
   if(sum==prod) {
	   System.out.println("The given number is spy number");
   }
   else {
	   System.out.println("The given number is not spy number");
   }
	}

}
