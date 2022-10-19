package string;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String n="9159386473";
  int l=n.length();
  if(l>10)
	  System.out.println("Invalid mobile number");
  else if(l<10)
	  System.out.println("Invaid obile number");
  else if(l==10)
	  System.out.println("Valid mobile number");
	}

}
