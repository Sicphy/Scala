import org.scalatest.FunSuite

class AverageTest extends FunSuite{
  test("AverageWithTailRec.average") {
    assert(Average.averageWithTailRec(Array(1, 2, 3, 3)) === 2)
    assert(Average.averageWithTailRec(Array(1)) === 1)
    assert(Average.averageWithTailRec(Array(48, 21, 36, 62)) === 41)
  }

  test("AverageWithLoop.average") {
    assert(Average.averageWithLoop(Array(1, 2, 3, 3)) === 2)
    assert(Average.averageWithLoop(Array(1)) === 1)
    assert(Average.averageWithLoop(Array(48, 21, 36, 62)) === 41)
  }
}