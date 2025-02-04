package introduction;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,5,8,19,45,36};
		int target = 19;
		System.out.println(search(arr,target,0,arr.length-1));
		
//		int x = (2000000000+2000000002)/2;
//		System.out.println(x); //-147483647
		/*
		 * there will be potential overflow of data if both start and end are close to the range of int hence we use start + (end-start)/2
		 */
	}
	public static int search(int[] arr, int target, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = start + (end-start)/2;
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[mid] > target) {
			return search(arr,target,start,mid-1);
		}
		return search(arr,target,mid+1,end);
	}
}
