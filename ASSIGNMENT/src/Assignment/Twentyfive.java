package Assignment;

public class Twentyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=757;
     int a=n;
     int reverse=0;
     while(n>0) {
    	 int remainder=n%10;
    	 n=n/10;
    	 reverse=reverse*10+remainder;
    	  }
     System.out.println(reverse);
     if(a==reverse) {
    	 System.out.println("Given number is palindrome");
     }
     else {
    	 System.out.println("The given number is not palindrome");
     }
	}

}
