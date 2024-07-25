package floor_of_an_array;

//floor number is the greatest number in an array which is <= target

public class FloorNumber {
	public static void main(String[] args) {
		int[] arr = {3,12,17,21,34,52};
		int target = 15;
		System.out.println(floor(arr, target));
	}
	
	static int floor(int[] arr, int target) {
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
		return end;
	}
}
