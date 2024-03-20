/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package ru.nspk.bio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() throws InterruptedException {
		Calculator calculator = new Calculator();
		System.out.println("Test started with Thread ID:" + Thread.currentThread().getId() + " with name" + Thread.currentThread().getName());
		Thread.sleep(500);
		System.out.println("Test ended with Thread ID:" + Thread.currentThread().getId() + " with name" + Thread.currentThread().getName());
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) throws InterruptedException {
		System.out.println("Test started with Thread ID:" + Thread.currentThread().getId() + " with name" + Thread.currentThread().getName());
		Thread.sleep(500);
		Calculator calculator = new Calculator();
		System.out.println("Test ended with Thread ID:" + Thread.currentThread().getId() + " with name" + Thread.currentThread().getName());
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
