package leetcode;

//https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,25,20,11};
		int target = 20;
		int peak = peakElement(arr);
		//System.err.println(peak);
		int first = findFirstIndex(arr, target, 0, peak);
		//System.err.println(first);
		int last = findLastIndex(arr, target, peak, arr.length-1);
		//System.err.println(last);
		if(last!=-1 && first!=-1) {
			System.out.println(first);
		}
	    else if(first==-1 && last!=-1){
	        System.out.println(last);
	    }
	    else if(first!=-1 && last==-1){
	    	System.out.println(first);
	    }
	    else{
        	System.out.println(-1);
        }
	}
	static int findLastIndex(int[] arr, int target, int start, int end) {
		
		int index = -1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(target < arr[mid]) {
				start = mid + 1;
			}
			else if(target > arr[mid]) {
				end = mid - 1;
			}
			else {
				index = mid;
				break;
			}
		}
		return index;
	}
	
	static int findFirstIndex(int[] arr, int target, int start, int end) {
		
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
				break;
			}
		}
		return index;
	}
	
	static int peakElement(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		   
		while(start<end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] > arr[mid + 1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
}
