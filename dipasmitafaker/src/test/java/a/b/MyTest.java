package a.b;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("learning junit")
public class MyTest {

	@BeforeAll //only once
	static void beforeAll() {
		System.out.println("Before all test methods");
	}
	
	@BeforeEach //just as many times the test method is run, this beforeEach will also run
	void beforeEach() {
		System.out.println("Before each test method");
	}
	
	@AfterEach //After the completion of the test methods as many times, it will also run
	void afterEach() {
		System.out.println("After each test method");
	}
	
	@AfterAll //Only once
	static void afterAll() {
		System.out.println("After all test methods");
	}
	
	@Test //the first test method
	void abc1()
	{
		System.out.println("I am test method 1");
	}
	
	@Test //the second test method
	void abc2() {
		System.out.println("I am test method 2");
	}
}
