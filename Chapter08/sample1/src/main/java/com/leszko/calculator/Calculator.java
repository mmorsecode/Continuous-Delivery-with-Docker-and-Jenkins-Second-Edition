package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * The Calculator class provides basic arithmetic operations.
 * It includes a caching mechanism for the sum operation.
 */
@Service
public class Calculator {
    final static int umlNUMBER1 = 3;

    /**
     * Returns the sum of two numbers.
     * 
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    @Cacheable("sum")
    public int sum(int a, int b) {
        return a + b;
    }
}

