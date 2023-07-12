package bubbleSort;

public class TesterBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 20, 60, 90, 10, 50, 70 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		BubbleSort.bubbleSorts(arr);
		System.out.println( );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}

	}

}
