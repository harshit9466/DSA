package com.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NthUglyNumber
{
	public int nthUglyNumber(int n, int a, int b, int c)
	{
		List<Integer> uglyNumbers = new ArrayList<>();

		int lenOfUglyNum = uglyNumbers.size();

		for(int i = 2; n != lenOfUglyNum; i++)
		{
			if(i % a == 0)
			{
				uglyNumbers.add(i);
				lenOfUglyNum++;
				continue;
			}

			if(i % b == 0)
			{
				uglyNumbers.add(i);
				lenOfUglyNum++;
				continue;
			}

			if(i % c == 0)
			{
				uglyNumbers.add(i);
				lenOfUglyNum++;
				continue;
			}
		}

		return uglyNumbers.get(n - 1);
	}

	//using priority Queue
	public int nthUglyNumberOptimal(int n, int a, int b, int c)
	{
		PriorityQueue<Long> minHeap = new PriorityQueue<>();
		HashSet<Long> seen = new HashSet<>();

		// Add the initial numbers to the heap
		minHeap.add((long) a);
		minHeap.add((long) b);
		minHeap.add((long) c);

		seen.add((long) a);
		seen.add((long) b);
		seen.add((long) c);

		long ugly = 0;

		for(int i = 0; i < n; i++)
		{
			ugly = minHeap.poll(); // Extract the smallest number

			// Generate the next multiples
			if(seen.add(ugly * a))
				minHeap.add(ugly * a);
			if(seen.add(ugly * b))
				minHeap.add(ugly * b);
			if(seen.add(ugly * c))
				minHeap.add(ugly * c);
		}

		return (int) ugly;
	}

}
