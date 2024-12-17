package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'findLowestPrice' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. 2D_STRING_ARRAY products
     *  2. 2D_STRING_ARRAY discounts
     */

    public static int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {
    // Write your code here
    Integer totalPrice=0;
    for (int i = 0; i < products.size(); i++) {
        int productPrice = Integer.parseInt(products.get(i).get(0));
        
     List<String> productList =   products.get(i);
      productPrice =Integer.parseInt(productList.get(0));
      List<String> discountNames = new ArrayList<>();
      for(int j=1;j<productList.size();j++)
      discountNames.add(productList.get(j));
      List<Integer> allDisPrices=null;
     
     
     
     for(String prodDisName:discountNames){
     for(int k=0; k<discounts.size(); k++){
        List<String> disDetails= discounts.get(k);
        
        String disName= disDetails.get(0);
        //if(disDetails.get(1))
        int disType = Integer.parseInt(disDetails.get(1));
        int disAmount= Integer.parseInt(disDetails.get(2));
         allDisPrices = new ArrayList<>();
        if(prodDisName.equalsIgnoreCase("EMPTY")){
            allDisPrices.add(productPrice);
        }
        if (prodDisName.equalsIgnoreCase(disName)){
            if(disType==0){
               int disAmmount=productPrice;
               allDisPrices.add(disAmmount);
            }
            if(disType==1){
               int disAmmount=productPrice-(productPrice*disAmount/100);
               allDisPrices.add(disAmmount);
            }
            if(disType==2){
               int disAmmount=productPrice-disAmount;
               allDisPrices.add(disAmmount);
            }
            
        }
    }
    
    }
     
     Collections.sort(allDisPrices);
     totalPrice=totalPrice+allDisPrices.get(0); 
     
     
    }
    
    
    
    return totalPrice;
    }
    
    
    
    

}
public class Solution {
    public static void main(String[] args) throws IOException {
    	List<String> prodList = new ArrayList<String>();
    	prodList.add("10");
    	prodList.add("d1");
    	prodList.add("d2");
    	List<List<String>> products = new ArrayList<>();
    	products.add(prodList);
    	List<List<String>> discounts = new ArrayList<>();
    	List<String> dis = new ArrayList<String>();
    	dis.add("d1");
    	dis.add("0");
    	dis.add("10");
    	discounts.add(dis);
    	List<String> dis1 = new ArrayList<String>();
    	dis1.add("d2");
    	dis1.add("1");
    	dis1.add("10");
    	discounts.add(dis1);
    	
    	System.out.println(Result.findLowestPrice(products, discounts));
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int productsRows = Integer.parseInt(bufferedReader.readLine().trim()); int
		 * productsColumns = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<List<String>> products = new ArrayList<>();
		 * 
		 * IntStream.range(0, productsRows).forEach(i -> { try { products.add(
		 * Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		 * .collect(toList()) ); } catch (IOException ex) { throw new
		 * RuntimeException(ex); } });
		 * 
		 * int discountsRows = Integer.parseInt(bufferedReader.readLine().trim()); int
		 * discountsColumns = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<List<String>> discounts = new ArrayList<>();
		 * 
		 * IntStream.range(0, discountsRows).forEach(i -> { try { discounts.add(
		 * Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		 * .collect(toList()) ); } catch (IOException ex) { throw new
		 * RuntimeException(ex); } });
		 * 
		 * int result = Result.findLowestPrice(products, discounts);
		 * 
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
    }
}
