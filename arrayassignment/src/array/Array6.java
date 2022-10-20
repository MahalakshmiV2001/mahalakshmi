package array;

public class Array6 {

	public static void main(String[] args) { // 6.removing given number from an array
		// TODO Auto-generated method stub
		int arr[] = { 99, 55, 67, 56, 27, 34, 67 }; // 0 1 2 3 4 5 6
		int element = 67;
		int count = 0;
		int n=0;
		int s=0;
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i])
				count++;
		}
		System.out.println("Repeat elements:" + count);
		
		int b[]=new int [arr.length-count];
		for(int i:arr)
		{
			if(element!=arr[n])
			{
			b[s]=arr[n];
				s++;
			}
			n++;
			
		}
		for(int k:b)
		{
			System.out.println(k);
		}
				

	}
}
