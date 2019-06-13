package com.fansh;

import org.junit.Assert;
import org.junit.Test;

/**
 * 〈〉 〈〉
 *
 * @author suhuangfan
 * @since 2019/6/13
 */
public class FizzBuzzGameTest {


  private FizzBuzzGame fizzBuzzGame = initFizzBuzzGame();

  @Test
  public void testSayFizz() {
    Assert.assertEquals(fizzBuzzGame.say(6), "Fizz");
    Assert.assertEquals(fizzBuzzGame.say(31), "Fizz");
  }

  private FizzBuzzGame initFizzBuzzGame() {
    return new FizzBuzzGame(3, 5);
  }

  @Test
  public void testSayBuzz() {
    Assert.assertEquals(fizzBuzzGame.say(10), "Buzz");
    Assert.assertEquals(fizzBuzzGame.say(59), "Buzz");
  }


  @Test
  public void testSayFizzBuzz() {
    Assert.assertEquals(fizzBuzzGame.say(30), "FizzBuzz");
  }


  @Test
  public void testSayOriginalNumber() {
    Assert.assertEquals(fizzBuzzGame.say(1), "1");
  }

  @Test
  public void testPrint() {
    String result = "";
    for (int i = 1; i <= 100; i++) {
      result = result + fizzBuzzGame.say(i) + " ";
    }
    Assert.assertEquals(result, "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 Fizz Fizz Buzz 26 Fizz 28 29 FizzBuzz Fizz Fizz Fizz Fizz FizzBuzz Fizz Fizz Fizz Fizz Buzz 41 Fizz Fizz 44 FizzBuzz 46 47 Fizz 49 Buzz FizzBuzz Buzz FizzBuzz FizzBuzz Buzz Buzz FizzBuzz Buzz Buzz FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz Fizz 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 Fizz Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz ");
  }
}
