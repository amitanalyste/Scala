class Rational(numerator: Int, denominator: Int) {
  require(denominator > 0)
  private def abs(n: Int) = if(n > 0) n else - n
  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a%b)
  private val g = gcd(numerator, denominator)
  private val flag = if (g > 0) 1 else -1
  private val p = (flag*numerator)/abs(g)
  private val q = denominator/abs(g)

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational((p * that.q + that.p * q), q*that.q)
  def +(that: Int): Rational =
    new Rational(p + q*that, q)

  def *(that: Rational): Rational =
    new Rational(p * that.p, q * that.q)
  def *(that: Int) = new Rational(p*that, q)
  def inverse() = new Rational(-p, q)

  def -(that: Rational): Rational =
    this + (that.inverse)
    //new Rational((p * that.q - that.p * q), q*that.q)
  def -(that: Integer): Rational =
    new Rational(p - q*that, q)

  def /(that: Rational) = new Rational(p * that.q, q * that.p)
  def /(that: Int) = new Rational(p, q * that)
  def >(that: Rational): Boolean = p * that.q > q * that.p
  def <(that: Rational): Boolean = that > this
  
  def max(that: Rational) = if (this > that) this else that

  override def toString() = if (q == 1) p.toString else p + "/" + q

}
implicit def intToRational(x: Int) = new Rational(x)
val x = new Rational(2, 3)

x * x
x * 2
2 * x