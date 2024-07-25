package leetcode;

public class RotatedArrayBinarySearch {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(binarySearch(arr, target));
	}
	public static int binarySearch(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		int leftSearch = -1;
		int rightSearch = -1;
		
		if(pivot==-1) {
			int start = 0;
			int end = arr.length-1;
			while(start<=end) {
				int mid = (start+end)/2;
				
				if(target > arr[mid])
					start = mid +1;
				else if(target < arr[mid])
					end = mid - 1;
				else
					return mid;
			}
			return -1;
		}
		else if(arr[pivot]==target)
			return pivot;
		else {
			leftSearch = splitSearch(arr, target, 0, pivot);
			rightSearch = splitSearch(arr, target, pivot+1, arr.length-1);
		}
		
		if(leftSearch!=-1) {
			return leftSearch;
		}
		else if(rightSearch!=-1) {
			return rightSearch;
		}
		else {
			return -1;
		}
			
	}
	public static int splitSearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(target > arr[mid])
				start = mid +1;
			else if(target < arr[mid])
				end = mid - 1;
			else
				return mid;
		}
		return -1;
	}
	public static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(mid < end && arr[mid] > arr[mid+1])
				return mid+1;
			if(mid > start && arr[mid] < arr[mid-1])
				return mid-1;
			if(arr[start] >= arr[mid])
				end = mid - 1;
			else
				start = mid+1;
		}
		return -1;
	}
}
