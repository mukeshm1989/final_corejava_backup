package com.corejava.walmart;

public class FindMinimuJump {
public static void main(String[] args) {
	int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	
	int jump=0;
	int count =0;
	int n = arr.length;
	
	for(int i=jump;i<=n;i=jump) {
		count++;
		jump = arr[i];
		n= n-jump;
	}
	
	System.out.println(count);
//	for(int i=jump;i<n;i++) {
//		if(arr[i] == 0) {
//			System.out.println("-1");
//			break;
//	}
//		
//		i = arr[i];
//		if(i<n-i) {
//			System.err.println(count++);
//		}
//	
//}
//System.out.println(count);
}


}
