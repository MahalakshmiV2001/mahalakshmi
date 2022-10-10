package Assignment;

public class Thirtyone {
    public static void main(String args[]) {
    	int p=28;
    	int n=p;
    	int sum=0;
    	for(int i=1;i<n;i++) {
    		if(n%i==0) {
    			sum=sum+i;
    			System.out.println(sum);
    		}}
    		if(sum==p)	{
    			System.out.println("The given number is perfect number");
    		}
    	else {
    		System.out.println("The given number is notperfect number");
    	}
    	
    
    	
    }
}
