import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
 GradeBook a1,a2;
	@BeforeEach
	void setUp() throws Exception {
		a1= new GradeBook(5);
		a1.addScore(6);
		a1.addScore(5);
		a1.addScore(1);
		a1.addScore(8);
		
		a2= new GradeBook(5);
		a2.addScore(8);
		a2.addScore(7);
	}

	@AfterEach
	void tearDown() throws Exception {
		a1=a2=null;
	}

	@Test
	void testaddScore() {
		assertEquals("6.0 5.0 1.0 8.0 ", a1.toString());
		assertEquals("8.0 7.0 ", a2.toString());
		assertEquals(4 ,a1.getScoreSize());
		assertEquals(2 ,a2.getScoreSize());
	}
	@Test
	void testsum() {
		assertEquals(20, a1.sum());
		assertEquals(15, a2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(1, a1.minimum());
		assertEquals(7, a2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(19, a1.finalScore());
		assertEquals(8, a2.finalScore());
	}

}
