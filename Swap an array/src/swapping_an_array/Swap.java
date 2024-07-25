package swapping_an_array;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int[] arr = {10,2,78,45,3};
		
		reverse(arr);
		System.out.println(Arrays.toString(arr) );
	}
	
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	static void swap(int[] arr, int startIndex, int endIndex) {
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
		
		
	}
}
