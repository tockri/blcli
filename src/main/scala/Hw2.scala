import org.scalatest._


object Hw2 {
  def main(args:Array[String]) = {
    run(new HwSpec)
  }
}

class HwSpec extends FlatSpec with Matchers {
  "Hello" should "be said" in {
    val a = 1
    val b = 2
    (a + b) should be (3)
    (a - b) should be (-1)
  }

  "Bye" should "be said" in {
    val c = 3
    val d = 5
    (c + d) should be (5)
    (c - d) should be (10)
  }
}