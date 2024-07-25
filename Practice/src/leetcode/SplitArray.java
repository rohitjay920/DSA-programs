package leetcode;
// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {
	public static void main(String[] args) {
		int[] nums = {7,2,5,10,8};
		int k = 2; // number of splits
		
		System.out.println(binarySearch(nums, k));
	}
	
	public static int binarySearch(int[] nums, int k) {
		int start = 0;
		int end = 0;
		for(int i : nums) {
			start = Math.max(start, i);
			end += i;
		}
	
		
		while(start<end) {
			int mid = (start+end)/2;
//			System.out.println(mid);
			if(canSplit(nums,k,mid)) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start; // here start and end will be same so we can return anything
	}
	
	public static boolean canSplit(int[] nums, int k, int maxValue) {
		int currentSum = 0;
		int count = 1;
		
		for(int i : nums) {
			if(currentSum + i > maxValue) {
				currentSum = i;
				count++;
	
				if(count>k) {
					return false;
				}
			}
			else {
				currentSum += i;
			}

		}
		return true;
	}
}
