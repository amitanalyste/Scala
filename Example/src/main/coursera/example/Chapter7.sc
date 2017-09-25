val args = Array("Amit", "salt.scala", "-is.scala", "salty")

val file_name = if (!args.isEmpty) args(0) else "default.txt"
def gcdLoop(x: Long, y: Long): Long =
  if(x % y == 0) y else gcdLoop(y, x%y)

val filesHere = (new java.io.File("/Users/amit/Scala/Example/src/main/coursera/example")).listFiles

for (file <- filesHere)
  println(file)
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList
val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    //print(trimmed)
    if trimmed.matches(".*for.*")
  } yield trimmed.length
val n = 10
val half = try {
  if (n % 2 == 0) n/2 else throw new RuntimeException("n must be an even")
}catch {
  case e : RuntimeException => (n-1)/2
}
val firstArg = if (args.length > 0) args(0) else ""

firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}


