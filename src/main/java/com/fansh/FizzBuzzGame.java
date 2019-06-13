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
    if (isContains(number) || isDivide(number)) {
      return true;
    }
    return false;
  }

  private boolean isDivide(int number) {
    return number % secNum == 0;
  }

  private boolean isContains(int number) {
    return String.valueOf(number).contains(String.valueOf(secNum));
  }

  private boolean sayFizz(int number) {
    if (String.valueOf(number).contains(String.valueOf(firstNum)) || (number % firstNum == 0)) {
      return true;
    }
    return false;
  }
}
