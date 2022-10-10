package Assignment;

public class Fouteenthpgm {

	public static void main(String[] args) {      //finding prime number or not
		// TODO Auto-generated method stub

		int c=6;
		 int a=0;
		 for(int i=2;i<c;i++) {
			 if(c%i==0)
			 {
				 a++;
				 break;
			 }}
			 if(a>0) 
				 System.out.println(" Given number is not prime number");
			 else
				 System.out.println(" Given number is prime number");
			 

	}

}
