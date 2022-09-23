package practice;

public class Maximumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,2,10,12};
int max=a[0];
int index=0;
for(int i=0;i<a.length;i++) {
	if(a[i]>max) {
	   max=a[i];
	   index=i;
	}
}
System.out.println(max);
System.out.println(index);
//		int a[]= {6,8,2,10,12};
//		int index=a[0];
//         
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>index) {
//			   index=i;	
//			}
//		}
//		System.out.println(index);
	}

}
