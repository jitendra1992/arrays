package arrays;
/*Write an efficient C program to find smallest and second smallest element in an array.

Example:

Input:  arr[] = {12, 13, 1, 10, 34, 1}
Output: The smallest element is 1 and 
        second Smallest element is 10*/

public class SmallestAndSecondSmallest {
	public static void main(String args[]){
		int[] arr = new int[]{12, 13, 1, 10, 34, 1};
		findSmall(arr);
	}
	
	private static void findSmall(int[] arr){
		int index;
		int smallIndex = 0;
		int smallest = arr[0];
		int secondSmallest;
		if (arr.length > 1){
			for (index = 1 ; index < arr.length ; index++){
				if (arr[index] < smallest){
					smallest = arr[index];
					smallIndex = index;
				}
			}
			int diff = arr[0] - smallest;
			secondSmallest = arr[0];
			for (index = 1 ; index < arr.length ; index++){
				
				if (arr[index] - smallest < diff && index != smallIndex){
					diff = arr[index] - smallest;
					secondSmallest = arr[index];
				}
			}
			System.out.println("The smallest is : " + smallest);
			System.out.println("The second smallest is : " + secondSmallest);
			
		} else {
			System.out.println("The smallest is : " + smallest);
			System.out.println("The second smallest is : " + smallest);
		}
		
		
		
	}

}
