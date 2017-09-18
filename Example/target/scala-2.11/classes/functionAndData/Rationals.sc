//package functionAndData
class Rational(x: Int, y: Int) {
  def n = x
  def d = y
}
object Rationals{
  val x = new Rational(1,2)

  def makeString(r: Rational): Unit = r.n + "/" + r.d

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.n*s.d + s.n*r.d, r.d*s.d
    )
  println(makeString(addRational(new Rational(1,2), new Rational(2,3))))
}