
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch{
	
	//Find index of element from array of random, non-repeating integers
	
	//The solution approach:
	//1] Generate unsorted array of random, non-repeating integers
	//2] Sort the array
	//3] use Binary Search to find the index of the element
	
	/*
	1]	Generate unsorted array of random, non-repeating integers
	*/
	public static int[] generateRandomUniqueArray(int size){	
		ArrayList<Integer> list = new ArrayList<>(size);
		for (int i = 0; i <= size; i++){
			list.add(i+5);
		}
		int[] arr = new int[size];
		for (int count = 0; count < size; count++){
			arr[count] = list.remove((int)(Math.random() * list.size()));
		}
		return arr;
	}
	
	/*
	2]	Sort the array -> insertionSort
	*/
	
	public static int[] insertionSort(int[] arr){
		long startTime = System.nanoTime();
		for(int i=0; i<arr.length; i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		long endTime = System.nanoTime();
		System.out.println("InsertionSort = " + (endTime-startTime) + " nanoseconds");
		return arr;
	}
	
	/*
	3] Use BINARY SEARCH to return the index of the element

	*/
	
	public static int binarySearch(int[] arr, int element, int low, int high){
		long startTime = System.nanoTime();
		while(low<=high){
			int mid = low + (high - low)/2;
			if(arr[mid]==element){
				return mid;
			}
			if(arr[mid]<element){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Search Time = " + ((endTime-startTime)/1000000));
		return -1;
	}
	
	public static int altBinary01(int[] arr, int LB, int UB, int ITEM){
		long startTime = System.nanoTime();
		int BEG = LB;
		int END = UB;
		int MID = (BEG+END)/2;
		int LOC = -1;
		
		while(BEG<=END && arr[MID]!=ITEM){
			if(ITEM<arr[MID]){
				END=MID-1;
			}
			else{
				BEG=MID+1;
			}
			MID=(BEG+END)/2;
		}
		long endTime = System.nanoTime();
		System.out.println("Binary Search = " + (endTime-startTime) + " nanoseconds");
		if(arr[MID]==ITEM){
			LOC=MID;
		}
		else{
			LOC=-1;
		}
		return LOC;
	}
	
	
	public static void main(String[] args){
		
		//Generate array of non-repeating, random integers
		int[] arr1 = generateRandomUniqueArray(100000);
		//System.out.println(Arrays.toString(arr1));
		
		//Sort the array
		int[] arr2 = insertionSort(arr1);
		//System.out.println(Arrays.toString(arr2));
		
		//Use binary search to find index of given integers
		int x = 814;
		//int num = binarySearch(arr2, x, 0, arr2.length-1);
		int loc = altBinary01(arr2, 0, arr2.length-1, x);
		System.out.println(loc);
		
		System.out.println("Binary Search time complexity = O(logn) in worst case and O(1) in best case when the central index match the desired value");
		System.out.println("InsertionSort time complexity = O(n^2) in average and worst case and O(n) in the best case");
		
		//for very small n, insertion sort is faster than more efficient algorithms such as Quicksort and Mergesort
		
	}
}


/*
	NOTE:
	
	WHY MID IS low+(high-low)/2:
	
	mid = low + x 			// cool… this is convincing so far yet :P  
	// Hey!! I am substituting your fav mid formula down here :P 
	( high + low ) / 2 = low + x 
	 
	low + x = ( high + low ) / 2 
	x = ( high + low ) / 2 - low 
	x = ( high + low - 2 * low ) / 2 
	x = ( high - low ) / 2 

	
*/

