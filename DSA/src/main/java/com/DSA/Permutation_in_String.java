package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class Permutation_in_String {
	public boolean checkInclusion(String s1, String s2)
	{
        // Step 1: Edge case where s2 is smaller than s1
        if (s2.length() < s1.length()) {
            return false;
        }
		
		Map<Character, Integer> s1FrequencyMap = new HashMap<>();
		for (int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			s1FrequencyMap.put(ch, s1FrequencyMap.getOrDefault(ch, 0) + 1);
		}
		
		Map<Character, Integer> s2FrequencyMap = new HashMap<>();
		for (int i = 0; i < s1.length(); i++)
		{
			char ch = s2.charAt(i);
			s2FrequencyMap.put(ch, s2FrequencyMap.getOrDefault(ch, 0) + 1);
		}
		
	    // Check the first window before sliding
	    if (s1FrequencyMap.equals(s2FrequencyMap)) {
	        return true;
	    }
		
		for(int left = 0, right = s1.length(); right < s2.length(); left++, right++)
		{
				char leftChar = s2.charAt(left);
				int leftCharFrequency = s2FrequencyMap.get(leftChar);
				if(leftCharFrequency == 1)
				{
					s2FrequencyMap.remove(leftChar);
				}
				else 
				{
					s2FrequencyMap.put(leftChar, leftCharFrequency - 1);
				}
				
				char rightChar = s2.charAt(right);
				s2FrequencyMap.put(rightChar, s2FrequencyMap.getOrDefault(rightChar, 0) + 1);
				
				// Check if the frequency maps match
			    if (s1FrequencyMap.equals(s2FrequencyMap)) {
			        return true;
			    }
			
		}
		
		return false;
	}
	
    public static void main(String[] args) {
    	Permutation_in_String solution = new Permutation_in_String();

        // Test Case 1
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(solution.checkInclusion(s1, s2)); // Expected: true

    }
}
