
public class RightTriangle {

	public static void main(String[] args) {
		int count = 5, k = 1;
		for (int i = 1; i <= 5; i++) {
			// count += i;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			// System.out.println(count);
			// count =0;
		}
		// -------for triangle ---------
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				do {
					System.out.print("-");
					k++;
				} while (k <= count);

				System.out.print("*");
				// count--;
				// k = 1;
			}
			count--;
			k = 1;
			System.out.println();
			// System.out.println(count);
			// count =0;
		}

		// -------for opposite right triangle ---------
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j >= 1; j--) {
				if(j> i) {
					System.out.print("-");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
