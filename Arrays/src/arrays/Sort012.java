package arrays;

/*Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first, then all 1s and all 2s in last.

Example
Input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
Output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}*/



public class Sort012 {
	public static void main(String args[]){
		int[] arr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}
	
	private static void sort(int[] arr){
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp = 0;
		while (mid <= high){
			switch(arr[mid]){
			case 0:
				if (arr[low] != arr[mid]){
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
				}
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				if (arr[mid] != arr[high]){
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
				}
				high--;
				break;
			}
		}
	}
	
	private static void printArray(int[] arr){
		for (int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
