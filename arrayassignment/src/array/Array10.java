package array;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {67,99,44,80,21,76,50,5};
       int minimum=a[0];
       int k=0;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]<minimum) {
    	  minimum=a[i];
    	  k=i;
    	   }
       }
    System.out.println(minimum);
	}
}
