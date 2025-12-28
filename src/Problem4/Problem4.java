package Problem4;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO OF VALUES IN THE LIST: ");
		int n = sc.nextInt();
		System.out.println("ENTER THE LIST OF VALUES");
		
		
		int[] list = new int[n];
		for(int i = 0; i < n; i++ ) {
			list[i] = sc.nextInt();
		}
		System.out.print("{");
		for(int i = 1; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(list[j] % i == 0) {
					count++;
				}
			}
			System.out.print(i + ": " + count);
			if(i != 9) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		sc.close();
	}
}
