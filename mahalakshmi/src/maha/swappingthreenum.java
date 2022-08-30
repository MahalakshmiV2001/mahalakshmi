package maha;

public class swappingthreenum {
public static void main(String args[]) {
	System.out.println("Before swapping");
	int x=5;
	int y=3;
	int z=7;
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("z="+z);
	x=x+y+z;
y=(x-y)-z;
z=(x-y)-z;
x=x-(y+z);
	z=x-y+z;
	x=x-y+z;
	System.out.println("After swapping");
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("z="+z);
	

	
}
}
