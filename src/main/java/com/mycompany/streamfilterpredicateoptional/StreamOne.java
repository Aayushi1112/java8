package com.mycompany.streamfilterpredicateoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOne {
	public static void main(String args[]) {
		

		List<Integer> numList=new ArrayList<Integer>();
		numList.add(11);
		numList.add(22);
		numList.add(212);
		numList.add(221);
		numList.add(212);
		numList.add(131);
		numList.add(223);
		numList.add(229);
		List<Integer> oddNumList=new ArrayList<>();
	    List<Integer> evenNumList=new ArrayList<>();
		
	    Predicate<Integer> oddLogic = num-> num%2 != 0;
		
		oddNumList=numList.stream().filter(oddLogic).collect(Collectors.toList());
		
		
		
		System.out.println(numList);
	    
	    for(Integer num:numList) {
	    	if(num%2!=0) {
	    		oddNumList.add(num);
	    	}
	    	else
	    	{
	    		evenNumList.add(num);
	    	}
	    }
	    System.out.println("printing odd number"+oddNumList);
	    System.out.println("printing even numbers"+evenNumList);
	    
	    
	    //Java8
	    oddNumList=numList
	    .stream()
	    .filter((num)->{return num%2!=0;})
	    .collect(Collectors.toList());
	    System.out.println(oddNumList);
	    
	    
	    
	    oddNumList=numList
	    	    .stream()
	    	    .filter((num)->{return num%2!=0;})
	    	    .sorted()
	    	    .peek(e->System.out.println("printing"+e))
	    	    .collect(Collectors.toList());
	    	    System.out.println(oddNumList);
	}
	
/*	oddNumList=numLIst.stream().
			filter((num)->){
		if(num%2!=0) {
			return true;
		}else
		{
			return false;
		}).collect(Collectors.toList()));
		
		}
	*/
	
	
	
	
	}


