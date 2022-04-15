package Array;

import java.util.Arrays;

public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Time Complexity : O(n2)");
		return arr;
	}
	public static void main(String[] args) {
		int[] a1=new int[] {7,3,10,5,2,1};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(selectionSort(a1)));
	}
}



