object Chapter5{
  val sum = 1 + 2    // Scala invokes 1.+(2)
  val sumMore = 1.+(2)
  val longSum = 1 + 2L    // Scala invokes 1.+(2L)
  val s = "Hello, world!"
  s indexOf 'o'     // Scala invokes s.indexOf('o')
  s indexOf ('o', 5) // Scala invokes s.indexOf('o', 5)
  0 max 5
  0 min 5
  -2.7 abs
  //-2.7 round
  //1.5 isInfinity
  //(1.0/0) isInfinity
  //4 to 6
  //"bob" capitalize
  // "robert" drop 2


}