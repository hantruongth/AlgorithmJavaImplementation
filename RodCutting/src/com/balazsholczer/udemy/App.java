package com.balazsholczer.udemy;

public class App {

	public static void main(String[] args) {

		int lengthOfRod = 5;
		int[] prices = {0,2,5,7,3};
		
		RodCutting cutting = new RodCutting(lengthOfRod, prices);
		cutting.solve();
		cutting.showResult();
		
	}
}
