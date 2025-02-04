package recursion;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14};
		int target = 6;
		System.out.println(binarySearch(arr, target, 0, arr.length-1));
	}
	public static int binarySearch(int[] arr, int target, int start, int end) {
		if(start>end) {
			return -1;
		}
		if(target>arr[arr.length-1] || target<arr[0]) {
			return -1;
		}
		int mid = start + (end-start)/2;
		if(target==arr[mid]) {
			return mid;
		}
		if(target > arr[mid]) {
			return binarySearch(arr, target, mid+1, end);
		}
		return binarySearch(arr, target, start, mid-1);
	}
}
