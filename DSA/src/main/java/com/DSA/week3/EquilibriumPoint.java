package com.DSA.week3;

public class EquilibriumPoint
{
	// Function to find equilibrium point in the array.
	public static int findEquilibrium(int arr[])
	{
		//		int firstSum = 0;
		//		int lastSum = 0;
		//
		//		int mid = arr.length / 2;
		//		int size = arr.length;
		//
		//		firstSum = arr[0];
		//		lastSum = arr[size-1];
		//		int result = -1;
		//
		//		int i = 0;
		//		while(firstSum != lastSum)
		//		{
		//			if(firstSum == lastSum)
		//			{
		//				result = i;
		//				firstSum += arr[i + 1];
		//				lastSum += arr[size - 1];
		//				i++;
		//			}
		//			else if(firstSum < lastSum)
		//			{
		//				firstSum += arr[i + 1];
		//				i++;
		//			}
		//			else
		//			{
		//				lastSum += arr[size - 1];
		//				i++;
		//			}
		//		}
		//
		//		return result;

		int totalSum = 0;
		for(int num : arr)
		{
			totalSum += num;
		}

		int leftSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			totalSum -= arr[i]; // rightSum

			if(leftSum == totalSum) // check if its equilibrium
			{
				return i;
			}

			leftSum += arr[i]; // increase the leftSum
		}

		return -1;
	}
}
