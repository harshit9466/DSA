package com.DSA.week3;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
	public int romanToInt(String s)
	{
		// Map to store Roman numeral values
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int n = s.length();

		for(int i = 0; i < n; i++)
		{
			int current = romanMap.get(s.charAt(i));
			int next = (i < n - 1) ? romanMap.get(s.charAt(i + 1)) : 0;

			if(current < next)
			{
				result -= current; // Subtract for special cases like IV, IX
			}
			else
			{
				result += current; // Otherwise, add normally
			}
		}

		return result;
	}
}
