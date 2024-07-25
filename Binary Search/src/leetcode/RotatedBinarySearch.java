package leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearch {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(binarySearch(arr, target));
	}
	
	static int binarySearch(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		System.err.println(pivot);
		
		int leftPivotSearch  = -1;
		int rightPivotSearch = -1;
		
		if(pivot == -1) {
			//just do normal binary search
			int start = 0;
			int end = arr.length-1;
			
			while(start<=end) {
				int mid = start + (end - start)/2;
				if(target==arr[mid]) {
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
		else if(arr[pivot]==target) {
			return pivot;
		}
		else {
			leftPivotSearch = splitPivotSearch(arr, target, 0, pivot);
			rightPivotSearch = splitPivotSearch(arr, target, pivot+1, arr.length-1);
			System.out.println("---------------");
			System.err.println("left "+leftPivotSearch);
			System.err.println("right "+rightPivotSearch);
		}
		
		if(leftPivotSearch!=-1) {
			return leftPivotSearch;
		}
		else if(rightPivotSearch!=-1) {
			return rightPivotSearch;
		}
		else {
			return -1;
		}
		
//		---------------------------------- OR -----------------------------
		
	}
	
	static int splitPivotSearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target==arr[mid]) {
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
			
			if( mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			if(arr[start] >= arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		//if there is no pivot, i.e, if the array is not rotated
		return -1;
	}
}
