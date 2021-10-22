import scala. annotation. tailrec                //Importing library for the tail recursion
class FactorialTailRecursion {
  def factorial(num: Int): BigInt = {
    @tailrec //applying tail recursion
    def fact(num: Int, accum: Int): Int = {
      num match {
        case 0 => accum                          //if number is 0 then it will return result that is store in accumalator
        case _ => fact(num - 1, num * accum)     //in default case we are recursively calling our factorial function until we found our expected result
      }
    }
    fact(num, 1)
  }
}

