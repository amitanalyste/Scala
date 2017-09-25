object FirstClassFunction{
  /*
  Scala has first class function:
   1. they can be defined, and called.
   2. Write as unnamed literal and pass them as values.
   a. A function literal is compiled into a class
   * that when instantiated at runtime is a function value.
   b. Thus the distinction between function literals and values
   **  is that function literals exist in the source code,
   **  whereas function values exist as objects at runtime.
   **  The distinction is much like that between classes
   ** (source code) and objects (runtime).
  c.  Function values are objects, so you can store them
  *** in variables if you like.
  *** They are functions, too, so you can invoke them
  *** using the usual parentheses function-call notation.
  */

  (x: Int) => x + 1
  var increase = (x: Int) => x+1

  increase = (x: Int) => x+100
  val increment = (x: Int) => x + 100

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.filter((x: Int) => x > 0)
  someNumbers.foreach(x => println(x))
  //Short form of function literal
  someNumbers.filter(x => x > 0)
  //Place holder syntax
  someNumbers.filter(_ > 0)

  val f = (_: Int) + (_: Int)
  f(3,4)

  val g = (x: Int,y: Int) => x+y
  g(10, 30)

  //Partially applied functions
  someNumbers.foreach(println)
  def sum(a: Int, b: Int, c: Int) = a + b + c
  sum(1, 2, 3)

  val a = sum _
  a(1,2,3)




}