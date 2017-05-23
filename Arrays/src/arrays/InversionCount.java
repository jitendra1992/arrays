package arrays;
/*Inversion Count for an array indicates – how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0.
 *  If array is sorted in reverse order that inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

Example:
The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).*/
public class InversionCount {
	public static void main(String args[]){
		int[] arr = new int[]{2, 4, 1, 3, 5};
		int result = countInversions(arr, arr.length);
		System.out.println("The number of inversions are : " + result);
	}
	
	private static int countInversions(int[] arr, int length){
		int count = 0;
		for (int i = 0 ; i < length ; i++){
			for (int j = i+1 ; j < length ; j++){
				if (arr[i] > arr[j] && i < j){
					count++;
				}
			}
		}
		return count;
	}
}
