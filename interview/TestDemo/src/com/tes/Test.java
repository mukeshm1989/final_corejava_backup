package com.tes;

import java.util.HashMap;
import java.util.Map;

class Test { 
    // method to find factorial 
    // of given number 
    static int factorial(int n) 
    { 
        if (n == 0) { 
            return 1; 
        }
        return n * factorial(n - 1); 
    } 
  
    // main method 
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(5)); 
        
        int arr[] = {0, -1, 2, -3, 1,-4};
        int sum= -2;
        printPairOfNumber(arr,sum);
    } 
    
    public static void printPairOfNumber(int[] arr,int sum){
        System.out.println("test");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem = sum-arr[i];
            if(map.containsKey(rem)) {
                System.out.println(arr[i]+"," + rem);
            }else {
                map.put(arr[i],i);
            }
        }
    }
}