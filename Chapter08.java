
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * 2);
			number++;
		}

		int num[] = { 1, 2, 3, 4};
		for (int i = 0; i < num.length; i++ ) {
			System.out.println(num[i]);
		}

		for (int val : num) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
