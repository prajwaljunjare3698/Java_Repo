package com.programs;

public class Pattern {
	public static void main(String[] args) {
		String s = "Programming";
		String temp = "";
		for(int i=0; i<s.length();i++) {
			temp = temp + s.charAt(i)+" ";
			System.out.println(temp);
		}
		
		int a = 0;
		int b = 1;
		int c = 2;
		
		for(int j=1;j<=8;j++) {
			System.out.println(a);
			int sum = a+b+c;
			a = b;
			b = c;
			c = sum;
		}
	}
}
