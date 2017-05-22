package first10;
/*Question: Write a C function to find if a given integer x appears more than n/2 times in a sorted array of n integers.

Basically, we need to write a function say isMajority() that takes an array (arr[] ), array’s size (n) and a number to be searched (x) as parameters and returns true if x is a majority element (present more than n/2 times).

Examples:

Input: arr[] = {1, 2, 3, 3, 3, 3, 10}, x = 3
Output: True (x appears more than n/2 times in the given array)

Input: arr[] = {1, 1, 2, 4, 4, 4, 6, 6}, x = 4
Output: False (x doesn't appear more than n/2 times in the given array)

Input: arr[] = {1, 1, 1, 2, 2}, x = 1
Output: True (x appears more than n/2 times in the given array)*/

public class MajorityElementInSortedArray {
	public static void main(String args[]){
		int[] arr = new int[]{1, 2, 3, 3, 3, 3, 10};
		boolean result = isMajority(arr, arr.length, 3);
		System.out.println(result);
		boolean resultBinarySearch = isMajorityBinarySearch(arr, arr.length, 3);
		System.out.println(resultBinarySearch);
	}
	
	private static boolean isMajorityBinarySearch(int[] arr, int n, int x){
		int firstIndex = getFirstIndex(arr, 0, n-1, x);
		if (firstIndex == -1)
			return false;
		if ((firstIndex + n/2) <= (n-1) && arr[firstIndex + n/2] == x)
			return true;
		else 
			return false;
	}
	
	private static int getFirstIndex(int[] arr, int low, int high, int x){
		if (low <= high){
			int mid = (low+high)/2;
			if ((mid == 0 || arr[mid-1] < x) && (arr[mid] == x)){
				return mid;
			} else if (x > arr[mid]){
				return getFirstIndex(arr, (mid+1), high, x);
			} else {
				return getFirstIndex(arr, low, (mid-1), x);
			}
		}
		return -1;
	}
	
	private static boolean isMajority(int[] arr, int n, int x){
		int half = n/2;
		for (int i = 0 ; i < n ; i++){
			if ((i+half) <= (n-1) || arr[i] == x && arr[i+half] == x){
				return true;
			}
		}
		return false;
	}
	
	
}
