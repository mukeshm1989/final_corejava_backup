package com.interview.rough;

public class InterviewRejection1 {
	
	public static void main(String[] args) {
		String adress1 =  "sdfsdfdff sdfsdfs dfsdfsffsds fsafsaf sdfsdf sfdf asaaaaadsf";
		String address2 = "sdfsdfdff sdfsdfs dfsdfsffsds fsafsaf sdfsdf sfdf asasdcfvde";

		String str1 = adress1.substring(40,adress1.length());
		System.out.println(str1);
		String array[]  = str1.split("\\s+");
		int length = array.length;
		
		String arrayResult[] = adress1.split("\\s+");
		
		for(int i = arrayResult.length-1;i>length;i--) {
			address2 =  arrayResult[i]+" "+address2;
			
		}
		String finalResult = address2.substring(0,40);
		System.out.println(finalResult);
		System.out.println(finalResult.length());
	}
}
