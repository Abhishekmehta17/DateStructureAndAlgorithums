package selectionSort;

public class Defination {
	public static void selectioSort(int[] arr) {
		int temp;
		if (arr.length == 0) {
			System.out.println("array is empty");
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
