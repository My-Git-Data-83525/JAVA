package com.sunbeam;

import java.util.Comparator;

//public class Sort<T> implements Comparable<T>{
public class Sort {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) 
		{
			int k = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (c.compare(arr[j], arr[i]) == 0) 
				{
					// k=j;
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		
			
		
	}



}
