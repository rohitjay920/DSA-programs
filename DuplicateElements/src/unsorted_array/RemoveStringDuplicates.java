package unsorted_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveStringDuplicates {
	public static void main(String[] args) {
		String s = "ababa";
		Set set = new HashSet();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				set.add(s.substring(i, j));
			}
		}
		System.out.println(set.size());
		
		getCount(s);
	}
	
	public static void getCount(String s) {
		String string = "";
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				string+=s.substring(i, j)+" "; 
			}
		}
		String[] arr = string.trim().split(" ");
		String[] temp = new String[arr.length];
		int j=0;
		
		for(int i=0; i<arr.length-1; i++) {
			boolean isDuplicate = false;
			for(int k=0; k<j; k++) {
				if(arr[i].equalsIgnoreCase(temp[k])) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[j++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println("unique element count: "+j);
				
	}
}
