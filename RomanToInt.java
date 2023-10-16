package com.java.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String roman  = sc.next();
		char[] ch = roman.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int answer = 0;
		
		for(int i = 0; i<ch.length -1; i++) {
			try {
				int num1 = map.get(ch[i]);
				int num2 = map.get(ch[i+1]);
				
				if(num2 <= num1) {
					answer += num1;
				}
				else {
					answer -= num1;
				}
			}
			catch(NullPointerException e) {
				System.out.println("Please Enter a Valid Roman Number.");
			}
		}
		
		try {
			answer += map.get(ch[ch.length-1]);
		}
		catch(NullPointerException e) {
			System.out.println("Please Enter a Valid Roman Number.");
		}
		
		sc.close();
		System.out.println(answer);
	}

}
