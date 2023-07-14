package heapSortAlgo;

public class HeapSort {
	public static void heapSort(int[] arr, int leng) {
		if (leng <= 1)
			return;
		for (int i = leng - 1; i > 0; i--) {
			if (arr[i] > arr[(i - 1) / 2]) {
				int temp = arr[i];
				arr[i] = arr[(i - 1) / 2];
				arr[(i - 1) / 2] = temp;
			}
		} // end of for loop
		int temp = arr[0];
		arr[0] = arr[leng - 1];
		arr[leng - 1] = temp;
		heapSort(arr, leng - 1);
	}

}
