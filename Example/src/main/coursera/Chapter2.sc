object Chapter2{
  //Tuples
  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)
  //Set
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear" //jetSet = jetSet + "Lear"
  println(jetSet.contains("Cessna"))
  //If you want a mutable set, you'll need to use an import
  import scala.collection.mutable
  val movieSet = mutable.Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  movieSet
  import scala.collection.immutable.HashSet

  val hashSet = HashSet("Tomatoes", "Chilies")
  hashSet + "Coriander"

  //Map
  import scala.collection.mutable

  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))
  treasureMap
  val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
  )
  romanNumeral(4)
  def printArgs(args: Array[String]): Unit ={
    args.foreach(x => println(x))
  }
  def formatArgs(args: Array[String]) =
    args.mkString("\n")
  formatArgs(Array("Zero", "One", "Two"))
  
}
