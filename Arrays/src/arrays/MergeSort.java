package arrays;

public class MergeSort {
	public static void main(String args[]){
		int[] arr = new int[]{3,4,1,5,2};
		printArray(arr);
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
	private static void merge(int[] arr, int low, int mid, int high){
		int i,j;
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(i = 0; i < n1 ; i++){
			left[i] = arr[low + i];
		}
		for (j = 0 ; j < n2 ; j++){
			right[j] = arr[mid + 1 + j];
		}
		
		i = 0;
		j = 0;
		int k = low;
		while (i < n1 && j < n2){
			if (left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < n1){
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2){
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	private static void mergeSort(int[] arr, int low, int high){
		if (low < high){
			int mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
	private static void printArray(int[] arr){
		for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
