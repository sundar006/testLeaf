package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 11, 4, 6, 7, 9 };
		int[] arr1 = { 1, 2, 8, 4, 9, 7, 11 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr1.length; j++) {

				if (arr[i] == arr1[j]) {

					System.out.println("Intersecting points are " +arr[i]);
				}
			}

		}
	}

}

/*
 int[] arr = { 3, 2, 11, 4, 6, 7,9};
		int[] arr1 = { 1, 2, 8, 4, 9, 7,11 };

		for (int i = 0; i < arr.length; i++) {
			// System.out.println("value of arr[" +i+ "] is " +arr[i]);

			for (int j = 0; j < arr1.length; j++) {
				// System.out.println("value of arr1[" +j+ "] is " +arr1[j]);
				if (arr[i] == arr1[j]) {
					//System.out.println("ivalue is " + i + "J value is " + j);
					System.out.println(arr[i]);
				}
			}
			//System.out.println(arr[i]);
		}
	}
 * } }
 */