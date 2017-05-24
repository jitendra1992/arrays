package arrays;
/*Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ] 
then returned value should be 2 (Diff between 7 and 9)
*/

public class MaxDiffBetnTwoElements {
	public static void main(String args[]){
		int[] arr = new int[]{2,3,10,6,4,8,1};
		int diff = getDiff(arr);
		System.out.println(diff);
	}
	
	private static int getDiff(int[] arr){
		int maxDiff = arr[1] - arr[0];
		int min = arr[0];
		for (int i = 1 ; i < arr.length ; i++){
			if (arr[i] - min > maxDiff){
				maxDiff = arr[i] - min;
			}
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return maxDiff;
	}
}
