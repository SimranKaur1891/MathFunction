package com.sample.function;

import java.util.Scanner;

public class Add {

	int func;
	int a,b;
	private static Scanner input;
	
	public static void main(String args[]) {
		
		System.out.println("Enter any two integer a and b where 0<a,b<100001");
		input = new Scanner(System.in);
		int a=Integer.parseInt(input.nextLine());
		System.out.println("f(a):" +a);
		int b=Integer.parseInt(input.nextLine());
		System.out.println("f(b):" +b);
		Add x= new Add();
		x.add(a,b);
	}

	private int add(int x, int y) {
		// f(a+b)=f(a)+f(b);
		func=x+y;
		System.out.println("f(a*b):"+func);
		return func;
	}
}
