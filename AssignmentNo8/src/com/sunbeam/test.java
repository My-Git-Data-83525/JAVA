package com.sunbeam;

import java.util.Comparator;

public class test {

	public static void main(String[] args) {
//		Integer arr2[] = { 33, 11, 22, 44, 55 };
//		System.out.println("Before Sorted");
//			for(Integer element:arr2)	
//				System.out.println(element);
//			Sort s=new Sort();
//			s.selectionSort(arr2, Comparator.naturalOrder());
//			System.out.println("After Sorted");
//			for(Integer element:arr2)	
//				System.out.println(element);
//			
//			s.selectionSort(arr2, Comparator.reverseOrder());
//			System.out.println("After Sorted in Reverse order");
//			for(Integer element:arr2)	
//				System.out.println(element);
		
//		class SelectSort implements Comparator<Integer>{
//			
//			 @Override
//	public int compare(Integer o1, Integer o2) {
//		int value=Integer.compare(o1, o2);
//		return value;
//	}
//			
//		}
//		Comparator c=new SelectSort();
//
//	    Sort s=new Sort();		
//		Integer arr2[] = { 33, 11, 22, 44, 55 };
//		System.out.println("Before Sorted");
//			for(Integer element:arr2)	
//				System.out.println(element);
//			s.selectionSort(arr2, c);
//	
//			System.out.println("After Sorted");
//			for(Integer element:arr2)	
//				System.out.println(element);
//==========Double====================

		class SelectSort implements Comparator<Double>{
			
			 @Override
	public int compare(Double o1, Double o2) {
		int value=Double.compare(o1, o2);
		return value;
	}
			
		}
		Comparator c=new SelectSort();

		    Sort s=new Sort();		
		    Double arr2[] = { 33.0, 11.4, 22.3, 44.7, 55.9 };
			System.out.println("Before Sorted");
				for(Double element:arr2)	
					System.out.println(element);
				s.selectionSort(arr2, c);
		
				System.out.println("After Sorted");
				for(Double element:arr2)	
					System.out.println(element);
			
			
			
	}

}

