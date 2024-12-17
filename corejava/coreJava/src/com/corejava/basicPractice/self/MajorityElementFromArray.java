package com.corejava.basicPractice.self;

public class MajorityElementFromArray {

	public static void main(String[] args) {
		int[] nums = {2, 3, 2, 4, 2, 5, 2};
		int candiadte = nums[0];
		int majorityThreshold = nums.length/2;
		int majorityElement = -1;
		int count = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(count==0) {
				candiadte=nums[i];
				count=1;
			}else if(candiadte==nums[i]) {
				count++;
			}else {
				count--;
			}
		}
		count =0;
		for(int num:nums) {
			if(num==candiadte) {
				count++;
			}
		}
		majorityElement = count>majorityThreshold ? candiadte : -1;
		System.out.println(majorityElement);
	}
}
