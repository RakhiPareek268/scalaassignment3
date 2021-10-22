import org.scalatest.flatspec.AnyFlatSpec
class factorialRecursionTest extends AnyFlatSpec {
 "condition" should "be invalid if 5 will return" in {
    val obj = new FactorialRecursion
    assert(!(110==obj.factorial(5)))
  }

  "condition" should "be valid as 0 will return 1" in {
    val obj = new FactorialRecursion
    val temp:Int=obj.factorial(0)
    assert(1==obj.factorial(0))
  }

  "condition" should "be valid as 8 will return 40320" in {
    val obj = new FactorialRecursion
    assert(40320==obj.factorial(8))
  }
}

