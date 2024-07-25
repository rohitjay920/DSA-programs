package infosys;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//You are given a string S.
//You can perform the following two operations on
//S any number of times(possibly zero):
//1. Remove the first character from S.
//2. Remove the last character from S.
//Find the total number of distinct non-empty strings that can be generated.

/*
 * Input:
ababa
Output:
9
Explanation:
S = "ababa"
It can be found that there are a total of 9 non-empty strings that can be generated.
 */

public class UniqueStrings {
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
				string+=s.subSequence(i, j)+" "; 
			}
		}
		String[] arr = string.trim().split(" ");
		String[] temp = new String[arr.length];
//		this works only if the array is sorted
//		int count=0;
//		int j=0;
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]!=arr[i+1]) {
//				temp[j++] = arr[i];
//				count++;
//			}
//		}
//		temp[j++] = arr[arr.length-1];
//		count++;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
				
	}
}
