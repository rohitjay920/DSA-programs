package leetcode;

/*
 * leetcode: 744
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

public class CharacterCeiling {
	public static void main(String[] args) {
		char[] letters = {'c','c','c','f','j'};
		char target = 'g';
		
		System.out.println(ceiling(letters, target));
	}
	
	static char ceiling(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length-1;
		
		if(target >= letters[letters.length-1]) {
			return letters[0];
		}
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			//target==arr[mid] is ignored as we have to find smallest letter greater than target not greater
			//than or equals to
			if(target > letters[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return letters[start];
	}
}
