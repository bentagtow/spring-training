package com.springbasics.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}