package example

object Example extends App{
  def abs(x: Double): Double = if(x < 0) -x else x
  def and(x: Boolean, y: => Boolean): Boolean = if(!x) false else y
  def or(x: Boolean, y: => Boolean): Boolean = if(x) true else y
}