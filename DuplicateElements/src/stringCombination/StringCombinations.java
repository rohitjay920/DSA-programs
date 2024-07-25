package stringCombination;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
	public static void main(String[] args) {
		String s = "ababa";
		List<String> list = new ArrayList();
		String temp = "";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				temp += j;
				list.add(temp);
			}
		}
		System.out.println(list.size());
	}
}
