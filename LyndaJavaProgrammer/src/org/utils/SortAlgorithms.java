package org.utils;

import java.lang.reflect.Array;

public class SortAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 50, 6, 2, 10, 5, 43, 3, 4, 1, 9 };
		// BubbleSort(numbers);
		SelectionSort(numbers);
		
		int[] numbersSort = { 2,10,12, 15 };
		BinarySearch(numbers,43);

		int[] numArray = { 15, 4, 2, 3, 25 };
		//InsertSort(numArray);
	}

	public static void BubbleSort(int[] num) {
		int temp;
		for (int i = 0; i <= num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void SelectionSort(int[] num) {
		int min = 0, temp = 0, iMin = 0;
		for (int i = 0; i < num.length; i++) {
			iMin = i; // Starting point - assume i is min
			for (int j = i + 1; j < num.length; j++) {
				// If number in array[j] less than min, set net index
				if (num[j] < num[iMin]) {
					iMin = j;
				}
			}
			min = num[iMin]; // outside loop, set min
			temp = num[i]; // hold number so we can swap.
			num[i] = min;
			num[iMin] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	// 15 4 2 5 25
	// 4 15 2 5 25
	//

	public static void BinarySearch(int[] array, int key) {
		int lowerBound = 0;
		int upperBound = array.length;
		int posn = array.length / 2;

		while (array[posn] != key && lowerBound <= upperBound) {

			if (array[posn] > key)
				upperBound = posn--;
			else
				lowerBound = posn++;
			posn = ((upperBound + lowerBound) / 2);
		}
		if (lowerBound < upperBound)
		  System.out.println(key + " found at position: " + posn);
		else
		  System.out.println(key + " not found! ");
	}

	// 0
	// TODO - Insert Sort
	public static void InsertSort(int[] num) {
		int temp;

		int[] holdArray = new int[num.length];
		for (int i = 0; i <= num.length; i++) {
			temp = num[i];
			for (int j = 0; j < i; j++) {
				// if (num[j] )
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
