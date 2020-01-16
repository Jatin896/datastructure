package com.test;
import java.util.*;
public class HackerRank {
	
	public static void main(String args[])
	{
		//int result =barterMarket(393,896,787,920);
		//System.out.println(result);
		List<Integer> itemList = new ArrayList<Integer>();
		itemList.add(6);
		itemList.add(1);
		itemList.add(2);
		itemList.add(1);
		
		int result =restock(itemList,100);
		System.out.println(result);
	}
	public static int barterMarket(int comicBooks, int coins, int coinsNeeded, int coinsOffered) {
	    // Write your code here
	    //System.out.println("Comic books " + comicBooks);
	    //System.out.println("coins" + coins);
	    //System.out.println("coinsNeeded " + coinsNeeded);
	    //System.out.println("coinsOffered " + coinsOffered);
	    int cosmicBooksLeft = 0;
	    int fictionBooks =0;
	    int coinsReqForCosmicBook =0;
	    int remainingCoins =0;
	    int moreFictionBooks =0;
	    if(coinsNeeded > 0){
	        coinsReqForCosmicBook = coins/coinsNeeded;
	        remainingCoins = coins % coinsNeeded;
	    }
	    if(comicBooks > 0){
	        fictionBooks = comicBooks - coinsReqForCosmicBook;
	        cosmicBooksLeft = comicBooks - coinsReqForCosmicBook;
	    }
	     if(cosmicBooksLeft > 0){
	     if(remainingCoins > 0 ){
	         moreFictionBooks = (remainingCoins + coinsOffered)/coinsNeeded;
	         if(moreFictionBooks > 0) {
	         moreFictionBooks = cosmicBooksLeft - moreFictionBooks;
	         }
	         else {
	            moreFictionBooks = 0; 
	         }
	      }
	      else{
	          if(coinsOffered > 0){
	           moreFictionBooks = coinsOffered/coinsNeeded;
	         if(moreFictionBooks > 0) {
	         moreFictionBooks = cosmicBooksLeft - moreFictionBooks;
	         }
	         else {
	            moreFictionBooks = 0; 
	         }
	         }
	         else {
	            moreFictionBooks = 0; 
	         }
	      }
	     }
	    
	    if(moreFictionBooks > 0 ){
	        return fictionBooks + moreFictionBooks;
	    }
	    else {
	        return fictionBooks;
	    }
	    }
	
	public static int restock(List<Integer> itemCount, int target) {
	    // Write your code here
	        int sum =0;
	        for(int i =0;i< itemCount.size(); i++){
	            sum = sum + itemCount.get(i).intValue();
	            if(sum > target){
	                break;
	            }
	        }
	        if(sum > target){
	            return sum - target;
	        }
	        else if(sum < target){
	            return target - sum; 
	        }
	        return 0;
	            }

	}


