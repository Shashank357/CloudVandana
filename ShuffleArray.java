package com.java.questions;

import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5,6,7};
		Random random = new Random();
		
		for(int i = 0; i<array.length; i++) {
			int randomIndex = random.nextInt(array.length);
			int num = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = num;
			
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
