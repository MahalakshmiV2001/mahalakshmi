package string;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name="mahalakshmi";
  
   for(int i=0;i<name.length();i++) {
	   char c=name.charAt(i);
	  // System.out.println(c);
	   if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
		   System.out.println("vowels in given string:" + c);
	   
   }
	}

}