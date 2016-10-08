package com.enthalpystudios.hackerank.warmup

import org.scalatest.FlatSpec

class DiagonalDifferenceCalculatorSpec extends FlatSpec {

  "a diagonal difference calculation on a NxN grid" should "return 15" in {

    val n = 3
    val matrix = Array.ofDim[Int](n, n)
    matrix(0)(0) = 11
    matrix(0)(1) = 2
    matrix(0)(2) = 4

    matrix(1)(0) = 4
    matrix(1)(1) = 5
    matrix(1)(2) = 6

    matrix(2)(0) = 10
    matrix(2)(1) = 8
    matrix(2)(2) = -12

    val diagonalDifference = DiagonalDifferenceCalculator.difference(n, matrix)
    assert(diagonalDifference == 15)

  }

}
