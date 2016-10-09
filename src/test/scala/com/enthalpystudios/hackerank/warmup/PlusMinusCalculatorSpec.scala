package com.enthalpystudios.hackerank.warmup

import org.scalatest.FlatSpec

class PlusMinusCalculatorSpec extends FlatSpec {

  "a plus minus calculation on N numbers" should "return fractions of positive numbers" in {

    val n = 6
    val numbers = Array.ofDim[Int](n)
    numbers(0) = -4
    numbers(1) = 3
    numbers(2) = -9
    numbers(3) = 0
    numbers(4) = 4
    numbers(5) = 1

    val plusMinus = PlusMinusCalculator.calculate(n, numbers)

    assert("%.6f".format(plusMinus.positives) == "0.500000")
    assert("%.6f".format(plusMinus.negatives) == "0.333333")
    assert("%.6f".format(plusMinus.zeros) == "0.166667")

  }

}
