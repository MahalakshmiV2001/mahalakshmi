package Assignment;

public class Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("The first 20 prime number:");
		for(i=1;i<=20;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0)
				break;	
			}
			if(i==j) {
				System.out.println(i);
			}
		}
	}
}
