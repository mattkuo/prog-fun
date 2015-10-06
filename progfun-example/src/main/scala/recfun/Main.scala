package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else if ( c < 0 || c > r) 0
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def balanceHelper(chars: List[Char], num: Int): Boolean = {
      if (num < 0 || (chars.isEmpty && num > 0)) false
      else if (chars.isEmpty && num == 0) true
      else if (chars.head == '(') balanceHelper(chars.tail, num + 1) 
      else if (chars.head == ')') balanceHelper(chars.tail, num - 1) 
      else balanceHelper(chars.tail, num)
    }
    
    return balanceHelper(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
  
}
