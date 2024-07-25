package leetcode;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class CharacterCeiling {
	public static void main(String[] args) {
		char[] arr = {'c','f','j'};
		char target = 'a';
		System.out.println(ceiling(arr,target));
	}
	static char ceiling(char[] arr, char target) {
		int start = 0;
		int end = arr.length-1;
		
		if(target > arr[arr.length-1] || target < arr[0]) {
			return arr[0];
		}
		
		while(start < end) {
			int mid = start + (end - start)/2;
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return arr[start];
	}
}
