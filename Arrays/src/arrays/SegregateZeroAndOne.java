package arrays;
/*You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] */

public class SegregateZeroAndOne {
	public static void main(String args[]){
		int[] arr = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregateArray(arr);
		for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void segregateArray(int[] arr){
		int low = 0;
		int high = arr.length - 1;
		while (low < high){
			while (arr[low] == 0 && low < high){
				low++;
			}
			while (arr[high] == 1 && low < high){
				high--;
			}
			if (low < high){
				arr[low] = 0;
				arr[high] = 1;
				low++;
				high--;
			}
		}
	}
}
