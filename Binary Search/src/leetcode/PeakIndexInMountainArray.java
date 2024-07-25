package leetcode;

/*
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,7,5,4,3};
		System.out.println(mountain(arr));
	}
	
	static int mountain(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > arr[mid + 1]) {
				//you are in descending part of an array
				//this maybe the answer but look for the left part of array
				end = mid;
			}
			else {
				//you are in ascending part of an array
				start = mid + 1;//beacuse we know that mid+1 element > mid element
			}
		}
		
	
		//in the end, start == end and pointing towards the largest number beacuse of the 2 checks above
		// start and end are always trying to find the maximum element in the above 2 checks
		// hence, when they both are pointing to one element that element is the largest element in array
		//beacuse that is what the checks say
		//more elaboration: at every point of time for start and end, they have the best possible answer till
		//that time and if we are saying that only one item is remaining, hence beacause of our above line that
		//is the best possible answer
		
		return start; //we can return end also as they will be pointing towards the same element
	}
}
