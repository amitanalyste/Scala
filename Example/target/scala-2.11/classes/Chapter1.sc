object Chapter1{
  def factorial(x: BigInt): BigInt =
    if(x == 0) 1 else x * factorial(x-1)
  factorial(30)
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus, " + oneTwoThreeFour + " is a new list.")
  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)
  val x = twoThree.:: (1)
  val oneTwoThre = 1 :: 2 :: 3 :: Nil
  val y = Nil
  y :+ (1) // Append
  y
  val thrill = "Will" :: "fill" ::
    "until" :: Nil
  thrill(2)
  thrill.count(s => s.length == 4)
  thrill.drop(2)
  thrill
  thrill.dropRight(2)
  thrill.exists(p => p == "until")
  thrill.filter(p => p.length == 4)
  thrill.forall(p => p.contains("il"))
  thrill.foreach(print)
  thrill.foreach(s => println(s))
  thrill.head
  thrill.init//Return the list of all element but last
  thrill.isEmpty
  thrill.last
  thrill.length
  thrill.map(s => s + 'B')
  thrill.mkString(", ")
  thrill.filterNot(p => p.length == 4)
  thrill.reverse
  thrill.sortWith((x,y) => x.charAt(0).toLower < y.charAt(0).toLower)
  thrill.tail
}