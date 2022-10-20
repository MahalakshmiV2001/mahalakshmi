package array;

public class Array9 {

	public static void main(String[] args) {  //9) Finding biggest no. in given array
		// TODO Auto-generated method stub
int a[]= {88,33,77,56,99,58,21};
      int max=a[0];

      for(int i=0;i<a.length;i++) {
        if(a[i]>max) {
        	max=a[i];
        }
      }
      System.out.println("The biggest number is:" +max);
	}

}
