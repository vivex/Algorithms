import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		int kases = in.nextInt();
		for(int i=0;i<kases;i++){
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];
			for(int j=0;j<n1;j++){
				arr1[j] = in.nextInt();
			}
			for(int j=0;j<n2;j++){
				arr2[j] = in.nextInt();
			}
			merge(arr1,arr2,0,n1-1,n1+n2-1);
		}
		
	}

	public static void merge(int[] L, int[] R, int l,int m, int r){
		int n1= m-l+1;
		int n2= r-m;		
		int i = 0;
	    int j = 0;	    
	    while(i<n1 && j<n2){
	    	if(L[i]>R[j]){
	    		System.out.print(L[i]+" ");
	             i++;
	    	} else{
	    		System.out.print(R[j]+" ");
	             j++;
	    	}
	    }	    
	    while (i < n1)
	    {
	    	System.out.print(L[i]+" ");
	        i++;
	    }	    
	    while (j < n2)
	    {
	    	System.out.print(R[j]+" ");
	        j++;
	    }
	    System.out.print("\n"); 
	}
	
	
	

}
