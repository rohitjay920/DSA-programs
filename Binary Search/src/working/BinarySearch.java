package working;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {40,25,20,11};
		int target = 20;
		System.out.println(binarySearch(arr, target));
	}
	
	//return the index of target
	//return -1 if the target does not exist
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end  = arr.length-1;
		
		while(start<=end) {
			//int mid = (start+end)/2; this might exceed the values of int is start and end values are higher
			/*
			 * Hence we have another formula i.e, "start + (end-start)/2" -> (2s + e - s)/2 -> (s+e)/2
			 * it finally traces back to the same formula but it eliminates of posibility of crossing int range
			 */
			int mid = start + (end -start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target>arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		return -1;
	}
}
