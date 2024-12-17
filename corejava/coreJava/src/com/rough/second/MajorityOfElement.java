package com.rough.second;

public class MajorityOfElement {
	public static void main(String[] args) {
		int[] nums = {2, 3, 2, 4, 2, 5, 2};
		
		int candidate = nums[0];
		int majorityThershold = nums.length/2;
		int majorityElement = -1;
		int count =1;
		
		for(int i=1;i<nums.length;i++) {
			if(count==0) {
				candidate = nums[i];
				count =1;
			}else if(candidate==nums[i]) {
				count++;
			}else {
				count--;
			}
		}
		count = 0;
		for (int num : nums) {
		    if (num == candidate) {
		        count++;
		    }
		}
		majorityElement = count>majorityThershold ?candidate:-1;
		System.out.println(majorityElement);
	}

}
