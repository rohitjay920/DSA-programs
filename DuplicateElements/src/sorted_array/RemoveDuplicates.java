package sorted_array;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,5,6,6};
		int[] temp = new int[arr.length];
		int j=0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		System.out.println("Number of unique elements: "+j);
		System.out.println(Arrays.toString(temp));
	}
}
