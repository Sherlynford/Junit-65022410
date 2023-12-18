package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuizOneJunitTest {

	 private QuizOneJunit quiz;
	   @Before
	   public void setUp() {
	       quiz = new QuizOneJunit();
	   }
	   @Test
	   public void testSquare() {
	       Assert.assertEquals(25, quiz.square(5));
	   }
	   @Test
	   public void testCountLetterA() {
	       Assert.assertEquals(0, quiz.countLetterA("school"));
	       Assert.assertEquals(3, quiz.countLetterA("banana"));
	   }
	   @Test
	   public void testCheckTwoLetter() {
	       Assert.assertTrue(quiz.checkTwoLetter("Ga"));
	       Assert.assertFalse(quiz.checkTwoLetter("T"));
	       Assert.assertTrue(quiz.checkTwoLetter("Tank"));
//	       Assert.assertTrue(quiz.checkTwoLetter("TaTa"));
	   }

}
