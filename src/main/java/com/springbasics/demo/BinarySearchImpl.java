package com.springbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	//sort array
	//search array
	//return the result
	@Autowired
	private SortAlgorithm sortAlgorithm;
	


	public int binarySearch(int[] numbers, int numberToSearchFor) {
				
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		return 3;
	}

}
