def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)
def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int = if(x == 0) 1 else x * fact(x)
def sum(f: Int => Int, a: Int, b: Int): Int =
  if(a > b) 0
  else f(a) + sum(f, a+1, b)

/*def sumInts(a: Int, b: Int) = sum(id, a, b)
def sumCubes(a: Int, b: Int) = sum(cube, a, b)
def sumFactorial(a: Int, b: Int) = sum(fact, a, b)*/
def sumInts(a: Int, b: Int) = sum(x => x, a, b)
def sumCubes(a: Int, b: Int) = sum(x => x*x*x, a, b)
def sumFactorial(a: Int, b: Int) = sum(fact, a, b)

def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, acc + f(a))
  }
  loop(a, 0)
}
sum(x => x * x)(3, 5)
sumInts(3, 5)
sumCubes(3,5)
