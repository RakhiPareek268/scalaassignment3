import org.scalatest.flatspec.AnyFlatSpec
class FactorialTailRecursionTest extends AnyFlatSpec {
  val obj =new FactorialTailRecursion
  "condition" should "be valid as 11 will return 39916800" in {
    assert(39916800==obj.factorial(11))
  }
  "condition" should "be invalid as 12 will return 3991600" in {
    assert(39916800!=obj.factorial(12))
  }
}
