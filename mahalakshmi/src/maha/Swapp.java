package maha;

public class Swapp {
public static void main(String args[]) {
	System.out.println("Before swapping");
int a=10;
int b=6;
a=10;
b=6;

a=a+b;
b=a-b;
a=a-b; 
System.out.println("Afer swapping");
System.out.println(a);
System.out.println(b);}
}