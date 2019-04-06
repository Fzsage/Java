package chap7new;

public class ArraysFour {

	public static void main(String[] args) {
		// simulate dice rolls and store counts in an array
		final int NUM_ROLLS = 1000000;
		int[] rolls = new int[13];
		// roll the dice
		for(int i = 0; i < NUM_ROLLS; i++) {
			int die1 = (int)(Math.random() * 6) + 1;
			int die2 = (int)(Math.random() * 6) + 1;
			int count = die1 + die2;
			rolls[count]++;
		}
		// display results of rolls
		// we start at 2 since you can't roll 0 or 1
		for(int i = 2; i < rolls.length; i++) {
			System.out.printf("Times rolled %d = %d \n", i, rolls[i]);
		}
	}

}
