import java.util.Arrays;




public class SortingArr03{

	//insertion sort
	public static int[] insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return arr;
	}	
		
	public static void main(String[] args){
	
		System.out.println("SORTING ALOGORITHMS");
		int[] arr1 = {5,2,3,7};
		int[] arr2 = {5,4,10,1,6,2};
		int[] res = insertionSort(arr2);
		System.out.println(Arrays.toString(res));
					
		}	
	}

	

