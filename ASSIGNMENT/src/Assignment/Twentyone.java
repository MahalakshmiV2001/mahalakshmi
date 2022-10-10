package Assignment;

public class Twentyone {
public static void main(String args[]) {  //print fibonacci series 0 1 1 2 3 5 8 13
	int n1=-1;
	int n2=1;
	int n3;
	int Z=0;         
	for(int i=1;i<9;i++)
	{
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		Z=Z+n3;
	
	}
	
}

}

