package com.fansh;

/**
 * 〈〉 〈〉
 *
 * @author suhuangfan
 * @since 2019/6/13
 */
public class FizzBuzzGame {
  private final int firstNum;
  private final int secNum;

  public FizzBuzzGame(int firstNum, int secNum) {
    this.firstNum = firstNum;
    this.secNum = secNum;
  }


  public String say(int number) {

    if (sayFizz(number) && sayBuzz(number)) {
      return "FizzBuzz";
    }

    if (sayFizz(number)) {
      return "Fizz";
    }

    if (sayBuzz(number)) {
      return "Buzz";
    }

    return String.valueOf(number);
  }

  private boolean sayBuzz(int number) {
    if (String.valueOf(number).contains(String.valueOf(secNum)) || (number % secNum == 0)) {
      return true;
    }
    return false;
  }

  private boolean sayFizz(int number) {
    if (String.valueOf(number).contains(String.valueOf(firstNum)) || (number % firstNum == 0)) {
      return true;
    }
    return false;
  }
}
