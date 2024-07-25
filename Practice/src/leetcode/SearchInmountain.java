package leetcode;

// https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInmountain {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,25,20,11};
		int target = 20;
		int peak = peakIndex(arr);
		
		int first = firstIndex(arr, target, 0, peak);
		int last = lastIndex(arr, target, peak, arr.length-1);
		
		if(first != -1 && last != -1) {
			System.out.println(first);
		}
		else if(first == -1 && last != -1) {
			System.out.println(last);
		}
		else if(first != -1 && last == -1) {
			System.out.println(first);
		}
		else {
			System.out.println(-1);
		}
	}
	static int peakIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid+1]) {
				//we are in descending part of an array so go left to check if there is a peak element
				end = mid;
			}
			else {
				//we are in ascending part of an array so go right to check if there is a peak element
				start = mid + 1;
			}
		}
		return start;
	}
	static int firstIndex(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}
	static int lastIndex(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}
	
}
