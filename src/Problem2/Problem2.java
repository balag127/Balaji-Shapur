package Problem2;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A: ");
		int a = sc.nextInt();
		
		int j = 0 ;
		while(a>0) {
			if(j % 2 != 0) {
				System.out.print( j);
				if(a != 1) {
					System.out.print(", ");
				}
				a--;
			}
			j++;
		}
		sc.close();
	}
}
