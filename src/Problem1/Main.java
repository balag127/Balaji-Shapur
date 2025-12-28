package Problem1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO MY CALCULATOR APP");
		System.out.println();
		System.out.print("Enter the value of A : ");
		double a = sc.nextDouble();
		System.out.println();
		System.out.print("Enter the value of B : ");
		double b = sc.nextDouble();
		System.out.println();
		System.out.println("Enter the Operation ");
		System.out.println("ADDITION -> add");
		System.out.println("SUBSTACTION -> sub");
		System.out.println("MULTIPLICATION -> mul");
		System.out.println("DIVISION -> div");
		String operation = sc.next();
		Add add = new Add(a,b);
		Sub sub = new Sub(a,b);
		Mul mul = new Mul(a,b);
		Div div = new Div(a,b);
		
		double result = 0;
		switch(operation) {
		
		case "add" : result = add.addition(a, b);
		break;
		
		case "sub" : result = sub.Substract(a, b);
		break;
		
		case "mul" : result = mul.Multipli(a, b);
		break;
		
		case "div" : if(b != 0) {
			result = div.division(a, b);
		} else{
			System.out.println("Denominator should not be 'ZERO'");
		}
			
		break;
		
		default:
			System.out.println("Worng option chosed!");
			System.exit(0);
		}
		System.out.println("Ans: " + result);
		sc.close();
	}
}
