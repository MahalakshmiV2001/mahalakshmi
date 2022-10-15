package practice2;

public class Maths {
void add(int a,int b) {
	if(a>b) 
		System.out.println("a is greater");
	else
		System.out.println("b is greater");
}
void add(float a,float b,float c) {
if(a>b&&a>c)
	System.out.println("a is greater");
else if(b>a&&b>c)
	System.out.println(" b is grater");
else
	System.out.println("c is greater");
	
}
public static void main(String args[]) {
	Maths a=new Maths();
	a.add(56, 44);
	Maths b=new Maths();
	b.add(45.2f,6.0f,1);
}
}
