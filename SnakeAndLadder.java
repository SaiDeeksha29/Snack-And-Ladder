/**
 * 
 */
package com.assignment2.training;

/**
 * @author saideeksha
 *
 */
public class SnakeAndLadder {

	/**
	 * @param args
	 */
	public static final int noPlay = 1;
	public static final int ladder = 2;
	public static final int snake = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variable
		int p1 = 0, p2 = 0;
		int cur = 0;

		int random = (int) (Math.random() * (6) + 1);

		// Computation
		if (p1 < 0) {
			p1 = 0;
		}
		if (p2 < 0) {
			p2 = 0;
		}
		while (p1 != 100 && p2 != 100) {
			if (cur % 2 == 0) {
				cur = p1;
				random = (int) (Math.random() * (6) + 1);
				int choice = (int) (Math.random() * (3) + 1);
				switch (choice) {
				case noPlay:
					break;
				case ladder:
					p1 = p1 + random;
					do {
						random = (int) (Math.random() * (6) + 1);
						p1 += random;
					} while (choice != ladder);
					break;
				case snake:
					p1 = p1 - random;
					break;
				}
			} else {
				cur = p2;
				random = (int) (Math.random() * (6) + 1);
				int choice = (int) (Math.random() * (3) + 1);
				switch (choice) {
				case noPlay:
					break;
				case ladder:
					p2 = p2 + random;
					do {
						random = (int) (Math.random() * (6) + 1);
						p2 += random;
					} while (choice != ladder);
					break;
				case snake:
					p2 = p2 - random;
					break;
				}
			}
			cur++;
		}
		if (p1 > p2) {
			System.out.println("Player 1 is winner");
		} else if (p1 < p2) {
			System.out.println("Player 2 is winner");
		} else {
			System.out.println("Player 1 and Player 2 are winners");
		}
	}

}