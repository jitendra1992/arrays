package arrays;

/*Given two sorted arrays, find their union and intersection.

For example, if the input arrays are:
arr1[] = {1, 3, 4, 5, 7}
arr2[] = {2, 3, 5, 6}
Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}. */

public class UnionIntersection {
	public static void main(String[] args){
		int[] a = new int[]{1,3,4,5,7};
		int[] b = new int[]{2,3,5,6};
		union(a,b);
		System.out.println("");
		intersection(a,b);
	}
	
	private static void union(int[] a, int[] b){
		common(a,b,true);
	}
	
	private static void intersection(int[] a, int[] b){
		common(a,b,false);
	}
	
	private static void common(int[] a, int[] b, boolean flag){
		int i=0,j=0;
		while (i < a.length && j < b.length){
			if (a[i] < b[j]){
				if(flag){
					System.out.print(a[i] + " ");
				}
				i++;
			} else if (a[i] == b[j]){
				System.out.print(a[i] + " ");
				i++;
				j++;
			} else if (a[i] > b[j]){
				if(flag){
					System.out.print(b[j] + " ");
				}
				j++;
			}
		}
		if(flag){
			while (i < a.length){
				System.out.print(a[i] + " ");
				i++;
			}
			while (i < b.length){
				System.out.print(b[j] + " ");
				j++;
			}
		}
		
	}
}
