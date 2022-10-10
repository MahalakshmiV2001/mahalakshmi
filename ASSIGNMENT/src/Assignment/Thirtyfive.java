package Assignment;

public class Thirtyfive {

	public static void main(String[] args) {         //strong number
		// TODO Auto-generated method stub
    int num=145;
     int sum=0;
     int rem;
     int tem=num;
    while(num>0) {
    	rem=num%10;
    	int fact=1;
    	for(int i=1;i<=rem;i++) {
    		fact=fact*i;
    	}
    	num=num/10;
    	sum=sum+fact;
    }
    if(tem==sum) {
    	System.out.println("Number is strong number");
    }
    else {
    	System.out.println("Number is not strong number");
    }
    
    
	}

}
