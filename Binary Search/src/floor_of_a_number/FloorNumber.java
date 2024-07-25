package floor_of_a_number;

/*
 * floor number is the greatest number in an array which is <= target
 */

public class FloorNumber {
	public static void main(String[] args) {
		int[] arr = {3,12,17,21,34,52};
		//floor and ceiling number only works if the array is sorted in ascending order
		int target = 15;
		System.out.println(floor(arr, target));
	}
	// returning floor number index
	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		if(target > arr[arr.length-1] || target < arr[0]) {
			return -1;
		}
		
		return end;
	}
}
