package com.rough;

public class MajorityArray {
public static void main(String[] args) {
	int[] nums = {3, 4, 3, 2, 4, 4, 4, 4};
	int majorityThreshold = nums.length / 2;
	int candidate = nums[0];
	int count = 1;
	int majorityElement = -1;

	for (int i = 1; i < nums.length; i++) {
	    if (count == 0) {
	        candidate = nums[i];
	        count = 1;
	    } else if (candidate == nums[i]) {
	        count++;
	    } else {
	        count--;
	    }
	}
	count = 0;
	for (int num : nums) {
	    if (num == candidate) {
	        count++;
	    }
	}
	majorityElement = count > majorityThreshold ? candidate : -1;
	System.out.println(majorityElement);
}
}
