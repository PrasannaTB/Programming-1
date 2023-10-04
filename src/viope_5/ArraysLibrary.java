package viope_5;

public class ArraysLibrary {

	public static Integer minimum(Integer[] array) {
		int min = array[0];
		return min;

	}

	public static Integer maximum(Integer[] array) {
		Integer max = array[array.length - 1];
		return max;
	}

	public static Double median(Integer[] array) {
		double median = 0;
		int N = array.length;

		if ((N + 1) % 2 == 0) {
			median = array[((N + 1) / 2) - 1];
		} else {
			median = (array[N / 2 - 1] + array[N / 2]) / 2.0;
		}

		return median;
	}

	public static double mean(Integer[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double mean = sum / array.length;
		return mean;
	}

	public static Double standardDeviation(Integer[] array) {
		double sampleMean = mean(array);
		double step1 = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			step1 = (array[i] - sampleMean) * (array[i] - sampleMean);
			sum = sum + step1;
		}
		double step2 = sum / (array.length - 1);
		double SD = Math.sqrt(step2);

		return SD;
	}

}
