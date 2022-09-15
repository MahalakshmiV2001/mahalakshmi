package maha;
public class Abcd {
public static void main(String args[]) {
	int a[]=new int[3];
	a[0]=76;
	a[1]=88;
	a[2]=76;
	if(a[0]>a[1]&&a[0]>a[2]) {
		System.out.println("a[0] is greater");
	}
	else if(a[1]>a[0]&&a[1]>a[2]) {
		System.out.println("a[1]is grater number");
	}
	else if(a[2]>a[0]&&a[2]>a[1])  {
		System.out.println("a[2] is greater");
	}
	else {
		System.out.println("ALL NUM ARE EQUAL");
	}
}
}
