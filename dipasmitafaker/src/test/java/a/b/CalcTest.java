package a.b;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcTest {

	static int x, y;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test methods, only once");
		x = y = 50;
		System.out.println("Value set...");
	}
	
	@Test
	void testAddNum() {
		Assertions.assertEquals(new Calc().addNum(x, y), 100);
	}

	@Test
	void testMulNum() {
		Assertions.assertEquals(new Calc().mulNum(x, y), 2500);
	}
	
	@AfterAll
	static void afterAll(){
		System.out.println("After all test methods");
		x = y = 0;
		System.out.println("All reset..");
	}

}
