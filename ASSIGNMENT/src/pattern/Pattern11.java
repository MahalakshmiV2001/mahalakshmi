package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=4;i++) {
    	 for(int j=i;j<4;j++) {
    		 if(j==i||i==1) {
    		 System.out.print(j+" ");
    	 }
    		 else {
    			 System.out.print("  ");
    		 }
    	
     }
    	 for(int j=4;j>4-i;j--) {
    		 if(i==4||i+j==4+1) {
    			 System.out.print(j+" ");
    		 }
    		 else {
    			 System.out.print("  ");
    		 }
    	 }
    	 System.out.println();
	}
     
	}}

