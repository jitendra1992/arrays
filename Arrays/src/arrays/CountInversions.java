package arrays;

public class CountInversions {
	public static void main(String args[]){
		int[] arr = {1, 20, 6, 4, 5};
		int i;
		for(i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int inversions = countInversions(arr, arr.length);
		System.out.println(inversions);
	}
	
	private static int merge(int[] arr, int[] temp, int low, int mid, int high){
		int count = 0;
		int i,j,k;
		i = low;
		j = mid;
		k = low;
		while ((i <= mid-1)  && (j <= high)){
			if (arr[i] <= arr[j]){
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
				count = count + (mid-i);
			}
			k++;
		}
		
		while (i <= mid-1){
			temp[k] = arr[i];
			k++;
			i++;
		}
		
		while (j <= high){
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for (i = low ; i <= high ; i++){
			arr[i] = temp[i];
		}
		return count;
	}
	
	private static int countInversions(int[] arr, int length){
		int[] temp = new int[length];
		return countInversions(arr, temp, 0, length - 1);
	}
	
	private static int countInversions(int[] arr, int[] temp, int low, int high){
		int count = 0;
		int mid;
		if (low < high){
			mid = (low + high)/2;
			count = countInversions(arr, temp, low, mid);
			count+= countInversions(arr, temp, mid+1, high);
			count+= merge(arr, temp, low, mid+1, high);
		}
		return count;
	}
}
