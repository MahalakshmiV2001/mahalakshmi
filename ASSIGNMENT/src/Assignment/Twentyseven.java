package Assignment;

public class Twentyseven {
public static void main(String args[]) {     //greatest common divisor of integer
	int n1=12;
	int n2=24;
	int min=n1<n2?n1:n2;
	while(min>=2) {
		if(n1%min==0&&(n2%min==0)) {
			System.out.println(min);
			min--;
		}
	}
}
}
