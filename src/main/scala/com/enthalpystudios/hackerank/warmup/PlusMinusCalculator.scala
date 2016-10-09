package com.enthalpystudios.hackerank.warmup

object PlusMinusCalculator {

  trait Number
  class Zero extends Number
  class Positive extends Number
  class Negative extends Number
  case class PlusMinus(positives: Float, negatives: Float, zeros: Float)

  def calculate(n: Int, numbers: Array[Int]) = {
    val counts = (numbers map toNumber).foldLeft(PlusMinus(0, 0, 0))(countNumbers)
    PlusMinus(counts.positives / n, counts.negatives / n, counts.zeros / n)
  }

  private def countNumbers(acc: PlusMinus, current: Number): PlusMinus = {
    current match {
      case n: Zero => PlusMinus(acc.positives, acc.negatives, acc.zeros + 1)
      case n: Positive => PlusMinus(acc.positives + 1, acc.negatives, acc.zeros)
      case n: Negative => PlusMinus(acc.positives, acc.negatives + 1, acc.zeros)
    }
  }

  private def toNumber(n: Int): Number = {
    n match {
      case `n` if n == 0 => new Zero
      case `n` if n > 0 => new Positive
      case `n` if n < 0 => new Negative
    }
  }

}
