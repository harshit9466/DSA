package com.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_2 
{
	//Brute force
	   public List<Integer> majorityElement(int[] nums)
	   {
	          // Create a frequency map to store counts of elements
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        // Count the frequency of each element
	        for (int num : nums) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        
	        // List to store the result
	        List<Integer> result = new ArrayList<>();
	        int threshold = nums.length / 3;
	        
	        // Check the frequency of each element
	        for (int key : frequencyMap.keySet()) {
	            if (frequencyMap.get(key) > threshold) {
	                result.add(key);
	            }
	        }
	        
	        return result;      
	    }

}
