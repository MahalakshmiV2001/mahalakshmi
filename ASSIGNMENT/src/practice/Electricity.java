package practice;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int unit=300;
     double amount=0;
     double rem=0;
     if(unit<=100&&unit>0){
    	 System.out.println(0);
     }
     else if(unit<=200&&unit>100) {
    	 rem=unit-100;
    	amount=rem*1.5;
    	System.out.println(amount);
     }
    
     else if(unit>200&&unit<500) {
  	  rem=unit-200;
       amount=rem*3;
       amount=amount+200;
       System.out.println(amount);
     
	}
     else if(unit>500) {
    	 rem=unit-500;
    	 amount=rem*6;
    	 amount=amount+1730;
    	 System.out.println(amount);
     }
    	
}}
