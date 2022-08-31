package maha;

public class Threenumswap {
public static void main(String args[])
{
int x=3;
int y=5;
int z=7;
x=x+z;
z=x-z;
x=x-z;
y=y+z;
z=y-z;
y=y-z;
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);
}
}
