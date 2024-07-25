package leetcode;

import java.util.Arrays;

/*
 * leetcode: 34
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

public class FirstLastPosition {
	public static void main(String[] args) {
		int[] arr = {5,7,7,7,7,8,8,10};
		int target = 8;
		
		int[] result = {-1,-1};
		
		int first = findIndex(arr, target, true);
		int last = findIndex(arr, target, false);
		result[0] = first;
		result[1] = last;
		System.out.println(Arrays.toString(result));
	}
	static int findIndex(int[] arr, int target, boolean firstOccureance) {
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;  
			}
			else {
				index = mid;
				if(firstOccureance) {
					end = mid - 1 ;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return index;
	}
}