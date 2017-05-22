package first10;

import utils.Result;

/*Write a C function to return minimum and maximum in an array. You program should make minimum number of comparisons.*/

public class MaxMinWithMinComparisons {
	public static void main(String args[]){
		int[] arr = new int[]{3,8,3,3,7,91,2};
		findMinMax(arr);
	}
	
	private static void findMinMax(int[] arr){
		int length = arr.length;
		Result result = new Result();
		int index;
		if (length == 1){
			result.setMin(arr[0]);
			result.setMax(arr[0]);
		} else if (length == 2){
			if (arr[0] > arr[1]){
				result.setMax(arr[0]);
				result.setMin(arr[1]);
			} else {
				result.setMax(arr[1]);
				result.setMin(arr[0]);
			}
		} else {//cases when length > 2
			if (length % 2 == 0){//set first two elements as max, min if even length
				if (arr[0] > arr[1]){
					result.setMax(arr[0]);
					result.setMin(arr[1]);
				} else {
					result.setMax(arr[1]);
					result.setMin(arr[0]);
				}
				index = 2;
			} else {//set first number as max, min if odd length
				result.setMax(arr[0]);
				result.setMin(arr[0]);
				index = 1;
			}
			for (int i = index; i < length ; i = i + 2){
				int tempMin, tempMax;
				if (arr[i] > arr[i+1]){
					tempMax = arr[i];
					tempMin = arr[i+1];
				} else {
					tempMax = arr[i+1];
					tempMin = arr[i];
				}
				if (result.getMin() > tempMin){
					result.setMin(tempMin);
				}
				if (result.getMax() < tempMax){
					result.setMax(tempMax);
				}
			}
		}
		System.out.println("Min : " + result.getMin() + " and Max : " + result.getMax());
	}
}

