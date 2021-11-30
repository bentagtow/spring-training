package com.springbasics.demo.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}