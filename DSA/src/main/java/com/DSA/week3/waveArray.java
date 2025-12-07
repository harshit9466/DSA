package com.DSA.week3;

public class waveArray
{
	public static void convertToWave(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i += 2)
		{
			int tempNum = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = tempNum;
		}
	}
}
