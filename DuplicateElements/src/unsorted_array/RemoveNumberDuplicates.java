package unsorted_array;

import java.util.Arrays;


public class RemoveNumberDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,2,8,4,4,5,7,9,9};
		int[] temp = new int[arr.length-1];
		int j=0;
		
		for(int i=0; i<arr.length-1; i++) {
			boolean isDuplicate = false;
			for(int k=0; k<j; k++) {
				if(arr[i]==temp[k]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[j++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));
	
	}
}
