package array;

public class Array8 {

	public static void main(String[] args) {  //8.how many times a given element is present
		// TODO Auto-generated method stub
  int a[]= {9,3,6,8,7,3,4,3,3,1,3};
  int element=3;
  int count=0;
  for(int i=0;i<a.length;i++) {
	  if(element==a[i])
		 // System.out.println(count);

		  count++;
  }
    System.out.println(count);
	}

}
