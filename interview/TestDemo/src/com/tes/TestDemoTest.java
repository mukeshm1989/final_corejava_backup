package com.tes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemoTest {
	
	public static void main(String[] args) {
		
		String str = "MoneyMoneywelcometoMONEYMoNeymoney";
		String inputSerach = "Money";
		String patternnew = "(?i)"+ inputSerach;
		String strRes = str.replaceAll(patternnew, "");
		System.out.println(strRes);
		
		System.out.println();
		
		int count = 0;
 		Pattern pattern = Pattern.compile(patternnew);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			count++;
		}
		
		System.out.println(count);
	}

}
