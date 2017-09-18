package example

import example.Example.abs

object Sqrt extends App{
  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if(isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs((guess * guess)/x - 1) < 0.001

    def improve(guess: Double) =
      (guess + x / guess)/2

    sqrtIter(1.0)
  }
  sqrt(0.001)
  println(sqrt(0.1e-20))
  println(sqrt(1.0e20))
  println(sqrt(1.0e50))
}
