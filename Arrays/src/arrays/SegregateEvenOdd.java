package arrays;
/*Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.

Example

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3} */


public class SegregateEvenOdd {
	public static void main(String args[]){
		int[] arr = new int[]{12, 34, 45, 9, 8, 90, 3};
		for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		segregate(arr);
		System.out.println("");
		for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void segregate(int[] arr){
		int low = 0 ; 
		int high = arr.length - 1;
		int temp;
		while (low < high){
			while (arr[low]%2 == 0 && low < high){
				low++;
			}
			while (arr[high]%2 == 1 && low < high){
				high--;
			}
			if ((arr[low]%2 == 1 && arr[high]%2 == 0) && low < high){
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
	}
}
