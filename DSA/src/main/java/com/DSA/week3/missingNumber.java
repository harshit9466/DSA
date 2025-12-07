package com.DSA.week3;

import java.util.Arrays;

public class missingNumber
{
	int missingNumber(int arr[])
	{
		Arrays.sort(arr);

		for(int i = 1; i <= arr.length; i++)
		{
			if(arr[i] == i)
			{
				continue;
			}
			else
			{
				return i;
			}
		}

		return -1;
	}
}
