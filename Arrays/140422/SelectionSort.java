
import java.util.Arrays;
                           //m -> comparing        
class SelectionSort{       //7,4,10,8,3,1
                           //i
                           //  m----->m>m
         public static int[] selectionSort(int[] arr){
                  for(int i=0; i<arr.length-1; i++){
                           //all of the list is unsorted
                           //setting min to i
                           int min=i;
                           //comparing other elements
                           //if any other element is less arr[i] than updating min to that index  
                           for(int j=i+1; j<arr.length; j++){
                                    if(arr[j]<arr[min]){
                                             min=j;
                                    }         
                           }
                           //after comparing,found min ele index, swapping
                           if(min!=i){
                                    int temp=arr[i];
                                    arr[i]=arr[min];
                                    arr[min]=temp;
                           }
                           System.out.println(Arrays.toString(arr));
                  }
                  System.out.println("Time Complexity : O(n2)");
                  return arr;
         }
         
         public static void main(String[] args){
                  
                  
                  int[] a1 = new int[] {7,4,10,8,3,1};
                  int[] a2 = new int[] {21,13,15,97,55,74,67,23,17,99,100,57,41};
                  int[] a3 = new int[] {1,2,5,3,9,7};         
                  System.out.println(Arrays.toString(selectionSort(a3)));
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
}
