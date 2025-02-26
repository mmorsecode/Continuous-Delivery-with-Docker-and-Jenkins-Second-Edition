package com.leszko.calculator;
// This is a test change for the PR to master branch

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
