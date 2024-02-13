import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int size = sc.nextInt();
		String space = "-";
		for (int row = 1; row <= size; row++) {
			System.out.print(row + ": ");
			int c = row;
			for (int column = size; column >= row; column--) {
				//---somobahu traingle korte hole space print korte hobe 
				if (c != 0) {
					System.out.print(space); 
					/* somobahu triangle
					 * - 5 4 3 2 1
					 * -- 5 4 3 2
					 * --- 5 4 3
					 * ---- 5 4
					 * ----- 5
					*/
					space += "-";
					c = 0;
				}
				System.out.print(" " + column);
				/*jodi space na dea hoy tahole
				 * -54321
				 * --5432
				 * ---543
				 * ----54
				 * -----5
				 * print korbe.
				
				*/ 

			}
			System.out.println();
		}

	}

}
