package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
		displayArray(arr);
	}
	public static void displayArray(int[] arr) {
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<=arr.length-1; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

}
