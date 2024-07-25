package leetcode;

// https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArray {
	public static int splitArray(int[] nums, int k) {
		int left = 0, right = 0;
		for (int num : nums) {
			left = Math.max(left, num); // The max single element (minimum possible largest sum)
			right += num; // The sum of all elements (maximum possible largest sum)
		}

		while (left < right) {
			int mid = (left+right) / 2;
			if (canSplit(nums, k, mid)) {
				right = mid; // Try for a smaller largest sum
			} else {
				left = mid + 1; // Increase the limit
			}
		}

		return left;
	}

	private static boolean canSplit(int[] nums, int k, int maxSum) {
		int subarrayCount = 1; // We start with one subarray
		int currentSum = 0;

		for (int num : nums) {
			if (currentSum + num > maxSum) {
				// Start a new subarray
				subarrayCount++;
				currentSum = num;
				if (subarrayCount > k) {
					return false; // We need more than k subarrays
					/*
					 * The purpose of this check is to determine whether the current mid value,
					 * representing a candidate for the maximum subarray sum, allows the array to be
					 * split into at most k subarrays.
					 * 
					 * In the canSplit method, the idea is to iterate through the array and try to
					 * form subarrays such that the sum of each subarray does not exceed maxSum.
					 * Each time the current sum exceeds maxSum, a new subarray is started. The
					 * subarrayCount variable keeps track of the number of subarrays formed.
					 * 
					 * If subarrayCount exceeds k at any point, it means that the current maxSum is
					 * too small to split the array into k or fewer subarrays. Therefore, we return
					 * false, indicating that we need to try a larger value for maxSum in the binary
					 * search.
					 */
				}
			} else {
				currentSum += num;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] nums1 = { 7, 2, 5, 10, 8 };
		int k1 = 2;
		System.out.println(splitArray(nums1, k1)); // Output: 18

		int[] nums2 = { 1, 2, 3, 4, 5 };
		int k2 = 2;
		System.out.println(splitArray(nums2, k2)); // Output: 9
	}
}
