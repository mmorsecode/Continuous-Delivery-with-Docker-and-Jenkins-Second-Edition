package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * A simple calculator service that provides caching for sum operations.
 */
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;

        /**
         * Returns the sum of two numbers and caches the result.
         * @param a First number
         * @param b Second number
         * @return The sum of a and b
         */
        @Cacheable("sum")
        public int sum(int a, int b) {
                return a + b;
        }
}

