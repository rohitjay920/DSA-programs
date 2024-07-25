package leetcode;

// check how many times the array is rotated

public class RotatedArrayPivotCount {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int pivot = findPivot(arr);
		if(pivot == -1) {
//			the array is not rotated
			System.out.println("The array rotated: "+(pivot+1)+" times");
		}
		else {
			System.out.println("The array rotated: "+(pivot+1)+" times");
		}
		
	}
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[start]>=arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
}
