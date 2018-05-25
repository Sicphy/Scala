import org.scalatest.FunSuite

class AverageTest extends FunSuite{
  test("Average.average") {
    assert(Average.averageList(List(1.8, 2.3, 3.2, 3.0)) === 2.575)
    assert(Average.averageList(List(2.5)) === 2.5)
    assert(Average.averageList(List(48.5, 21.8, 36.2, 62.1)) === 42.15)
  }
}