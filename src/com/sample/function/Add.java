package com.sample.function;

import java.util.Scanner;

public class Add {
	
	private static Scanner sc;

	public static void main(String args[]) {
	
	    int input;
	    
	      sc = new Scanner(System.in);
	      System.out.println("Enter any integer 'x' where 0<x<100001");
	      input = sc.nextInt();
	      
	      System.out.println(getNumber(input));
	}

	private static int getFunction(int input) {
		/*
		 *  getFunction() will find the possible factors of number such that
		 *  F(a*b)=F(a)+F(b),where a,b are two positive integers 
		 *  and sum of a and b is the minimum.
		 */
			int count = 0;
			for(int i = 2; i<=input; i++){
	    	  while(input%i==0) 
	    	  {
	    		  count=count+getNumber(i);
	    		  input=input/i;
	    		} 
	    	}
	      if(input>2)
	    	 System.out.println(count);
	    	  //System.out.println("sum:" +count);
	      return count;
	}

	private static int getNumber(int i) {
		/* 
		 *  getNumber() will filter out the input first follow below conditions:
		 *  1.F(x)=0 at x=0.
		 *  2.F(x)=1 at x=1.
	     *  3.F(x)=2 at x=2.
         *  4.F(x)=0 if x is odd prime.
		 */
		
		if(i==0)
			return 0;
		
		if(i==1)
			return 1;
		
		if(i==2)
			return 2;
		
		if(i%2==1)
			return 0;
		
		else
			return getFunction(i);			
	}
}