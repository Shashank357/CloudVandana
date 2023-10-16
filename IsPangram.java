package com.java.questions;

import java.util.Scanner;

public class IsPangram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		
		boolean[] check = new boolean[26];
		
		for(char ch :str.toCharArray()) {
			try {
				check[ch - 'A'] = true;
			}
			catch(IndexOutOfBoundsException e) {
				//Do nothing
			}
			
		}
		
		boolean isPangram = true;
		
		for(boolean boo : check) {
			if(!boo) {
				isPangram = false;
				break;
			}
		}
		sc.close();
		System.out.println(isPangram);
		
	}

}
