package selection_sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {21,1,45,0,-9};
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			int min = arr[i];
			int pos = i;
			for(int j=i+1; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
