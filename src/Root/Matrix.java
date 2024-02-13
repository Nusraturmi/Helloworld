package Root;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// 1:123456
//		2:123456
//		3:123456
//		4:123456
		//user er theke input nicchi.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int size = sc.nextInt();
		for (int row = 1; row <= size; row++) {
			System.out.print(row + ": ");
			for (int column = 1; column <= size ; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		//row soman column print. 
		for (int row = 1; row <= size; row++) {
			System.out.print(row + ": ");
			for (int column = 1; column <= row ; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		//break continue learn
		int i = 0;
		while (i<=10)
		{
			i++;
			if (i == 7)
				break;
			else if(i == 4)
				continue;
			System.out.println(i);
		}

	}

}
