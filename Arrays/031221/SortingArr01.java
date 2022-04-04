import java.util.Arrays;

public class SortingArr01{
	
	public static int[] setArr(int num){
		int[] arr = new int[num];
		for(int i = 0; i < num; i++){
			arr[i] = (int)(Math.floor(Math.random()*num));
		}
		return arr;
	}
	
	//optimised Bubble Sort
	public static int[] bubbleSort(int[] arr){
		double start = System.currentTimeMillis();
		for(int i = 0; i < arr.length-1; i++){
			System.out.println("pass : " + (i+1));
			int flag = 0;
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
					System.out.println(Arrays.toString(arr));
				}
			}
			System.out.println("---------");
			/*
			if(flag == 0){
				break;
			}
			*/
		}
		double end = System.currentTimeMillis();
		System.out.println("time in millis = " + (end - start));
		return arr;
	}
	
	//wrong bubbleSort
	public static int[] wrongBubbleSort(int[] arr){
		double start = System.currentTimeMillis();
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				if(arr[j] < arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	double end = System.currentTimeMillis();
	System.out.println("time in millis = " + (end - start));
		return arr;
	}
	
	
	
	/*
	public static int[] bubbleSortReverse(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i]; 
 					arr[i] = arr[j];
					arr[j] = temp;
					//System.out.println(Arrays.toString(arr));
				}
			}
		}
		return arr;
	}
	*/
	public static void main(String[] args){
		
		int[] arr1 = setArr(5);
		int[] arr2 = setArr(10);
		int[] arr3 = setArr(100);
		int[] arr4 = setArr(1000);
		int[] arr5 = setArr(10000);
		
		int[] arr6 = setArr(100000); 
		
		
		//bubble sort
		int[] arr0 = {15, 16, 6, 8, 5};
		int[] arr00 = {11, 2, 7, 9};
		int[] arr000 = {16,14,5,6,8};
		
		int[] arr01 = {1, 7, 6, 2, 4, 3, 3};
		
		int[] sortedArr01 = bubbleSort(arr01);
		System.out.println("---------------------------------");
		//int[] sortedArr02 = wrongBubbleSort(arr0);
		
		System.out.println(Arrays.toString(sortedArr01));
		//System.out.println();
		//System.out.println(Arrays.toString(sortedArr02));
		
		
		
		//int[] sortedArr1 = bubbleSort(arr3);	// ~ 1 milli
		//int[] sortedArr2 = bubbleSort(arr4);	// ~ 8 millis
		//int[] sortedArr3 = bubbleSort(arr5);	// ~ 220 millis
		//int[] sortedArr4 = bubbleSort(arr6);
		
		//System.out.println(Arrays.toString(sortedArr4));
		
		//reverse
		//int[] reverseSortedArr = bubbleSortReverse(arr6);
		//System.out.println(Arrays.toString(reverseSortedArr));		
		
		
		
		
		
		
		
		
	}
}