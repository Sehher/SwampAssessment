package com.qa.swamp;

import java.util.Scanner;

//I know I haven't done everything in separate classes with four principles, but I had a hard time figuring out how to even do it all in the first place (hence being nowhere near finished) 
//So I tried to get the logic in App first, then attempt to figure out how to separate everything out into methods and classes.
//I know this is awful, I'm sorry

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("You are in a swamp. Your goal is to find the treasure. You can only move north, south, east and west, one space at a time. After every move, you will be told how far you are from the treasure.");
		System.out.println("To go North: enter 1.");
		System.out.println("To go East: enter 2.");
		System.out.println("To go South: enter 3.");
		System.out.println("To go West: enter 4.");
		System.out.println("You may begin...");

		Constants c = new Constants();

		// DON'T KNOW WHY THIS WOULDN'T WORK THAT'S WHY I PUT NUMBERS FOR N,S,E,W
		// INSTEAD
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter direction...");
		// String direction = sc.nextLine();
		// System.out.println(direction.toLowerCase());
		//
		// if(direction.toLowerCase() == "east") {
		// System.out.println("Going east");
		// }
		// else{System.out.println("UGHHHH");}

		Integer[] row1 = { 1, 2, 3 };
		Integer[] row2 = { 4, 5, 6 };
		Integer[][] map = { row1, row2 };
		int max1 = 1;
		int max2 = 2;

		// int y = (int) (Math.random()*2);
		// int z = (int) (Math.random()*3);
		int x = 1;
		int y = 1;
		int treasure = map[x][y];

		int a = 1;
		int b = 2;
		int playerpos = map[a][b];

		Scanner input1 = new Scanner(System.in);
		System.out.println("number");
		int dir1 = input1.nextInt();

		// Constants c = new Constants();

		// RULES WHEN YOU MOVE SPACES

		if (dir1 == 1) {
			a = a - 1;
			System.out.println("Going north");
		} else if (dir1 == 2) {
			b = b + 1;
			System.out.println("Going east");
		} else if (dir1 == 3) {
			a = a + 1;
			System.out.println("Going south");
		} else if (dir1 == 4) {
			b = b - 1;
			System.out.println("Going west");
		}

		// THE INFINITY BIT

		if (a < 0) {
			a = max1;
		}
		if (b < 0) {
			b = max2;
		}
		if (a > max1) {
			a = 0;
		}
		if (b > max2) {
			b = 0;
		}

		System.out.println(a);
		System.out.println(b);

		if (playerpos == treasure) {
			System.out.println("you got the treasure");
		} else {
			System.out.println("go again");
		}

	}

}
