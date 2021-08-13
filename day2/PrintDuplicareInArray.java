package week1.day2;

public class PrintDuplicareInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 13, 11, 15, 20, 14, 18, 16, 17, 19, 18, 17, 20, 14 };

		int count;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			count = 1;

			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
