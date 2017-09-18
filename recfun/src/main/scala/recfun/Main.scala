package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    print(balance("())(".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

      if(c == r || c == 0)  1 else pascal(c, r-1) + pascal(c-1, r-1)
    }

  
  /**
   * Exercise 2
   */
/*    def balance2(chars: List[Char]): Boolean  = {
      var balance_flag = true
      var left = 0
      for(x <- chars) {
        if (x == '(') left += 1
        else if (x == ')' && left > 0) left -= 1
        else if (x == ')' && left < 1) balance_flag = false
      }
      if(!balance_flag || left > 0) false else true
    }*/
    def balance(chars: List[Char]): Boolean  = {
      //var left = 0
      def loop(chars: List[Char], left: Int): Boolean = {
        if(chars.isEmpty && left > 0) false
        else if(chars.isEmpty && left == 0) true
        else if(chars.head == '(') loop(chars.tail, left +1)
        else if(chars.head == ')' && left > 0) loop(chars.tail, left - 1)
        else if(chars.head == ')' && left == 0) false
        else loop(chars.tail, left)

      }

      loop(chars, 0)
    }

  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0) 1
      else if(money > 0 && !coins.isEmpty) countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else 0
    }
  }
