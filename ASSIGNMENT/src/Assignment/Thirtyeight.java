package Assignment;

public class Thirtyeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1 = -1;
			int n2 = 1;
			int n3 = 0;
			int j = 0;
			int i, c;
			int e = 0;
			{
				for (i = 0; i < 10; i++) {
					n3 = n1 + n2;
					n1 = n2;
					n2 = n3;

					c = 0;
					for (j = 2; j < i; j++) {
						if (n3 % j == 0) {
							c++;
							break;
						}
					}
					if (c == 0) {
						System.out.println(n3);
					}
		          }
			}
		}
					}