package maha;

public class swappingthreenum {
public static void main(String args[]) {
	int x=5;
	int y=3;
	int z=7;
	x=x+y+z;
	y=x-y+z;
	z=x-y+z;
	x=x-y+z;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	

	
}
}
