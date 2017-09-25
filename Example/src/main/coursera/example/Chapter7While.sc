object Chapter7While{
  val Args = Array("Amit", "salt.scala", "-is.scala", "salty")
  def searchFrom(i: Int): Int =
    if(i >= Args.length) -1
    else if (Args(i).startsWith("-")) searchFrom(i+1)
    else if (Args(i).endsWith(".scala")) i
    else searchFrom(i + 1)
  val i = searchFrom(0)
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10) yield makeRow(row)
    tableSeq.mkString("\n")
  }
  multiTable()

}

