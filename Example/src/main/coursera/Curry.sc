def sum(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f)(a+1, b)
sum(x => x*x)(3,5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if(a>b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))

def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a,b)
  //if (a > b) 1 else f(a) * product(f)(a+1, b)

product(x => x*x)(3,6)

def factorial(n: Int): Int = product(x => x)(1,n)
factorial(5)