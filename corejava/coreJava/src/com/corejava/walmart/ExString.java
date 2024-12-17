package com.corejava.walmart;

public class ExString {
	public static void main(String[] args) {
		String str = "RLRRLLRLRL";
		int result = balancedStringSplit(str);
		System.out.println(result);
		
	}
	public static int balancedStringSplit(String s) {
        int ans = 0, l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                ++l;
            } else {
                --l;
            }
            if (l == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
