package practice2;

public class Factrecurssion {
 int n=1;
 int fact= 1;             //factorial program using instance variable(recursion method)
 void display() {
	 fact=n*fact;
	 System.out.println(fact);
	   n++;
	 if(n<=5) {
		 display();
		// System.out.println(fact);
		
		 
	 }
 }
 public static void main(String args[]) {
	 Factrecurssion a=new Factrecurssion();
	 a.display();
 }
}
