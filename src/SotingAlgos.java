import java.util.Arrays;


public class SotingAlgos {

	public static void main(String[] args){
		
		
		int[] arr = new int[] {1,5,6,7,83,4,2,7,8};
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(bubbleSort(arr)));
		
		//System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
	
	
	
	/**
	 *  The complexity of bubble sort is O(n2) in the worst and average case because 
	 *  for every element we iterate over the the entire array each time.
	 *  uncomment the printlns to understand the algo
	 *  
	 *  It bubbles the maximum value to the top in one pass
	 *  @param arr
	 *  @return
	 */
	public static  int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					//System.out.println("Shifting "+arr[j]+" and "+arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//System.out.println("Pass Complete");
		}
		return arr;
	}
	
	/**
	 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
	 * (considering ascending order) from unsorted part and putting it at the beginning. 
	 * The algorithm maintains two subarrays in a given array.
     * 1) The subarray which is already sorted.
     * 2) Remaining subarray which is unsorted.
     * In every iteration of selection sort, the minimum element (considering ascending order) 
     * from the unsorted subarray is picked and moved to the sorted subarray.
     * 
     * Simply from the unsorted array find the minimum and put it in new array and remove from existing array.
     * complexity of O( n2 ).
     * 
     * It selectes the min value at put it in sorted array
	 */
	public static int[] selectionSort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			int minimum = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minimum]){
					minimum = j ;
				}
			}
			// now we got the minimum from ith position, till ith its sorted
			System.out.println("Swapping "+arr[minimum]+" and "+arr[i]);
			int temp = arr[minimum];
			arr[minimum] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	/**
	 * The way we sort the playing cards
	 * 
	 * it sinks the smallest value to bottom in one pass
	 * 
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			
			/*storing current element whose left side is checked for its 
            correct position .*/
			int temp = arr[i];
			int j = i;
			   /* check whether the adjacent element in left side is greater or
            less than the current element. */
			while(j>0 && temp<arr[j-1] ){
		           // moving the left side element to one position forward .
				  arr[j] = arr[j-1]; 
				  j=j-1;
			}
			 // moving current element to its  correct position.
	           arr[j] = temp;
		}
	
		return arr;
	}
	
	public static int[] mer(int[] arrge,int l,int m,int  r){
		
		return null;
	}
	
	
}
