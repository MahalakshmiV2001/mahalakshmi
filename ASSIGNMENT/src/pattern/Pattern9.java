package pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int val=1;
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=4-i;j--) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}

}
}