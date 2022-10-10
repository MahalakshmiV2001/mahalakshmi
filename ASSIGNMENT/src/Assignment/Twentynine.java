package Assignment;

public class Twentynine {

	public static void main(String[] args) {      // 29.Decimal to binary
		// TODO Auto-generated method stub
		
		int deci = 5;
		int rem = 0;
		String binary = " ";
		while (deci > 0) {
			rem = deci % 2;
			binary = rem + binary;
			deci = deci / 2;
		}
		System.out.println(binary);
}
}