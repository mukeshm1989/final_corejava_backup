package com.tes;

public class TestDemo123 {
	
	public static void main(String[] args) {
		int n = findFirstBadCommit(10);
		System.out.println(n);
	}
	
	public static int findFirstBadCommit(int n) {
		int low =1;
		int high = n;
		while(low<high) {
			int mid = (low+high)/2;
			if(isBug(mid)) {
				return mid;
			}else {
				low = mid;
			}
		}
		return -1;
	}
	
	// 1 10 // mid  = 5 , low = 5  // mid 
	public static boolean isBug(int bugId) {
		return bugId>=7;		
	}
}
