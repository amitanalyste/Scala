object rationals{
  class Rational(x: Int, y: Int) {
    require(y > 0, "denominator must be positive!")

    def this(x:Int) = this(x,1)
    private def abs(x: Int): Int = if(x > 0) x else -x
    private def gcd(a: Int, b: Int): Int = if(b == 0) abs(a) else gcd(b, a%b)

    def numer = x
    val denom = y

    def add(that: Rational) =
      new Rational(numer*that.denom + that.numer*denom, denom*that.denom)

    def neg = new Rational(-1 * numer, denom)

    def sub(that: Rational) = add(that.neg)

    def less(that: Rational) = numer * that.denom < that.numer * denom

    def max(that: Rational): Rational = if(this.less(that)) that else this
    override def toString = {
      val g = gcd(x,y)
      numer/g + "/" + denom/g
    }
  }

  val x = new Rational(1,2)
  val y = new Rational(2,3)
  val z = new Rational(3,4)

  x.sub(y).sub(z)
  x less y
  x.max(y)
  new Rational(2, 4).numer
}