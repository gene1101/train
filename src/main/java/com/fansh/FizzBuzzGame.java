package com.fansh;

/**
 * 〈〉 〈〉
 *
 * @author suhuangfan
 * @since 2019/6/13
 */
public class FizzBuzzGame {
  private final int firstSpecialNum;
  private final int secondSpeicalNum;

  public FizzBuzzGame(int firstSpecialNum, int secondSpeicalNum) {
    this.firstSpecialNum = firstSpecialNum;
    this.secondSpeicalNum = secondSpeicalNum;
  }


  public String say(int number) {

    if (isFizz(number) && isBuzz(number)) {
      return "FizzBuzz";
    }

    if (isFizz(number)) {
      return "Fizz";
    }

    if (isBuzz(number)) {
      return "Buzz";
    }

    return String.valueOf(number);
  }

  private boolean isBuzz(int number) {
    if (isContainsSpecialNumber(number, secondSpeicalNum) || isDivideSpecialNumber(number, secondSpeicalNum)) {
      return true;
    }
    return false;
  }

  private boolean isDivideSpecialNumber(int number, int specalNumber) {
    return number % specalNumber == 0;
  }

  private boolean isContainsSpecialNumber(int number, int specalNumber) {
    return String.valueOf(number).contains(String.valueOf(specalNumber));
  }

  private boolean isFizz(int number) {
    if (isContainsSpecialNumber(number, firstSpecialNum) || (isDivideSpecialNumber(number, firstSpecialNum))) {
      return true;
    }
    return false;
  }
}
