package client;

import logic.BubbleSort;

public class BubbleSortMain {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = bs.acceptArray();
		bs.printArray(arr);
		bs.bubbleSort(arr);
		System.out.println("\nThe sorted array is: ");
		bs.printArray(arr);
	}

}
