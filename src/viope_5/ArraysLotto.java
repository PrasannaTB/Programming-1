package viope_5;

import java.util.Arrays;
import java.util.Random;

public class ArraysLotto {

	public static void main(String[] args) {

		int[] lotteryNumbers = new int[7];
		int[] randomNumbers = new int[7];
		Random randomGenerator = new Random();

		for (int i = 0; i < 7; i++) {
			randomNumbers[i] = randomGenerator.nextInt(39) + 1;

		}
		Arrays.sort(randomNumbers);

		for (int i = 0; i < 7; i++) {

			if (i == 0 || randomNumbers[i] != randomNumbers[i - 1]) {
				lotteryNumbers[i] = randomNumbers[i];

			}
		}

		for (int i = 0; i < 7; i++) {
			System.out.print(lotteryNumbers[i] + " ");
		}

	}

}
