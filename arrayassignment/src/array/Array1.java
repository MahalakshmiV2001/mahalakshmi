package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [4];      // 1.array declaration
		a[0] = 90;
		a[1] = 80;
		a[2] = 70;
		a[3] = 60;
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
