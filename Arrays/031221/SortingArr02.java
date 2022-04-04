import java.util.Arrays;

public class SortingArr02{
	
	public static int[] setArr(int num){
		int[] arr = new int[num];
		for(int i = 0; i < num; i++){
			arr[i] = (int)(Math.floor(Math.random()*num));
		}
		return arr;
	}
	
	
	//bubble sort normal
	public static int[] bubbleSortNormal(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		return arr;
	}
	
	//optimised Bubble Sort
	public static int[] bubbleSort(int[] arr){
		double start = System.currentTimeMillis();
		for(int i = 0; i < arr.length-1; i++){
			//System.out.println("pass : " + (i+1));
			int flag = 0;
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
					//System.out.println(Arrays.toString(arr));
				}
			}
			//System.out.println("---------");
			if(flag == 0){
				break;
			}
		}
		double end = System.currentTimeMillis();
		System.out.println("time in millis bubbleSort = " + (end - start));
		return arr;
	}
	
	//insertion sort
	public static int[] insertionSort(int[] arr){
		double start = System.currentTimeMillis();
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		double end = System.currentTimeMillis();
		System.out.println("time in millis insertionSort = " + (end - start));
		return arr;
	}
	
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
		
		int[] arr02 = {2, 3, 1};
		//System.out.println(Arrays.toString(bubbleSortNormal(arr02)));
		//System.out.println(Arrays.toString(insertionSort(arr02)));
		
		
		//int[] sortedArr1 = bubbleSort(arr6);	
	
		int[] sortedArr5 = insertionSort(arr6);	
		
		
		
		//System.out.println(Arrays.toString(sortedArr1));
		//System.out.println(Arrays.toString(sortedArr5));
		
	}
}