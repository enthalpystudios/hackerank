package com.enthalpystudios.hackerank.warmup

object DiagonalDifferenceCalculator {

  def difference(n: Int, matrix: Array[Array[Int]]): Int = {
    val diagonals = 0 until n map ( i => (matrix(i)(i), matrix(n - i - 1)(i)))
    val diagonalSum = diagonals.foldLeft((0, 0))(sumOfDiagonals)
    val difference = math.abs(diagonalSum._1 - diagonalSum._2)
    difference
  }

  private def sumOfDiagonals(diagA: (Int, Int), diagB: (Int, Int)): (Int, Int) = {
    (diagA._1 + diagB._1, diagA._2 + diagB._2)
  }

}

