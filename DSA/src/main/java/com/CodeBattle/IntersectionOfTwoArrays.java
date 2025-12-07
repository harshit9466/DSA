package com.CodeBattle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays
{
	public int[] intersection(int[] nums1, int[] nums2)
	{
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();

		// Add nums1 elements to set1
		for(int num : nums1)
		{
			set1.add(num);
		}

		// Check nums2 elements in set1
		for(int num : nums2)
		{
			if(set1.contains(num))
			{
				resultSet.add(num);
			}
		}

		// Convert resultSet to int[]
		return resultSet.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args)
	{
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		int[] result = obj.intersection(nums1, nums2);
		System.out.println(Arrays.toString(result)); // Output: [2]
	}

}
