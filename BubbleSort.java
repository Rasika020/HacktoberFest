package logic;

import java.util.Scanner;

public class BubbleSort {
	public int[] acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        
        return arr;
        

    }
	public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
	public void bubbleSort(int arr[]){
	    int n = arr.length;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	    

	}


}
