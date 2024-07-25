package leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedArray {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(binarySearch(arr, target));
	}
	static int binarySearch(int[] arr, int target) {
		int pivot = pivot(arr);
		
		if(pivot == -1) {
			int start = 0;
			int end = arr.length-1;
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
		
		if(target == arr[pivot])
			return pivot;
		
		int leftSplit = splitPivotSearch(arr, target, 0, pivot);
		int rightSplit = splitPivotSearch(arr, target, pivot+1, arr.length-1);
		
		if(leftSplit != -1) 
			return leftSplit;
		else if(rightSplit != -1)
			return rightSplit;
		else
			return -1;
	}
	
	static int splitPivotSearch(int[] arr, int target, int start, int end) {
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
	static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid - 1;
			}
			if(arr[start] >= arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
