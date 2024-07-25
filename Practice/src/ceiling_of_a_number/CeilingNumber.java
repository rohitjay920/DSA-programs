package ceiling_of_a_number;

/*
 * ceiling number is a smallest number in an array >= target
 */

public class CeilingNumber {
	public static void main(String[] args) {
		int[] arr = {3,12,17,21,34,52};
		int target = 25;
		System.out.println(ceiling(arr,target));
	}
	public static int ceiling(int[] arr, int target) {
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
		if(target > arr[arr.length-1] || target < arr[0]) {
			return -1;
		}
		return start;
	}
}
