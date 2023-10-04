package viope_4;

public class MethodTools {
	public static Integer minimum(int int1, int int2, int int3) {
		int min;

		if (int1 < int2 && int1 < int3) {
			min = int1;
		} else if (int1 > int2 && int2 < int3) {
			min = int2;
		} else {
			min = int3;
		}
		return min;
	}
}
