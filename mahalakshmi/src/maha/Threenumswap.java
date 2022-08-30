package maha;

public class Threenumswap {
public static void main(String args[])
{
int x=5;
int y=3;
int z=7;
x=x+y;
y=x-y;
x=x-y;
y=y+z;
z=y-z;
y=y-z;
System.out.println(x);
System.out.println(y);
System.out.println(z);

}
}
