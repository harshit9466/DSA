package com.DSA.week3;

public class MaximumNestingDepthOfTheParentheses
{
	public int maxDepth(String s)
	{
		int currentDepth = 0;
		int maxDepth = 0;

		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);

			if(ch == '(')
			{
				currentDepth++; // Increase depth
				maxDepth = Math.max(maxDepth, currentDepth); // Track max depth
			}
			else if(ch == ')')
			{
				currentDepth--; // Decrease depth when closing bracket appears
			}
		}
		return maxDepth;
	}
}
