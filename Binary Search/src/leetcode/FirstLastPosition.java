package leetcode;

import java.util.Arrays;

/*
 * leetcode: 34
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class FirstLastPosition {
	public static void main(String[] args) {
		int[] arr = {5,7,7,7,7,8,8,10};
		//if target not found return this
		int[] result = {-1,-1};
		int target = 5;
		//check for first occurance of target 
		int start = findIndex(arr, target, true);
		//check for last occurance of target
		int end = findIndex(arr, target, false);
		
		result[0] = start;
		result[1] = end;
		
		System.out.println(Arrays.toString(result));
	}
	static int findIndex(int[] arr, int target, boolean findFirstOccurance) {
		//if the element not found
		int index = -1;
		
		int start = 0;
		int end = arr.length-1;
		
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
				if(findFirstOccurance) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return index;
	}
}
