package leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearchImprovised {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(search(arr, target));
		
	}
	
	static int search(int[] arr, int target) {
		int pivot = findPivot(arr);
		//if the array is not rotated
		if(pivot == -1) {
			//just do normal binary search
			return binarySearch(arr, target, 0, arr.length-1);
		}
		else if(arr[pivot] == target) {
			return pivot;
		}
		else {
			//if pivot is found then the array contains two ascending arrays on either side of pivot
			if(target >= arr[0]) { // target >= arr[start]
				return binarySearch(arr, target, 0, pivot-1);
			}
			return binarySearch(arr, target, pivot+1, arr.length-1);
		}
	}
	
	static int binarySearch(int[] arr, int target, int start,int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(target == arr[mid]) {
				return mid;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
	// this will not work for duplicate values
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
