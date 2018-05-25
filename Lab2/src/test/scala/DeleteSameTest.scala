import org.scalatest.FunSuite

class DeleteSameTest extends FunSuite{
  test("DeleteTheSame.delete") {
    assert(DeleteTheSame.deleteSame(Map(1 -> 1, 2 -> 1, 3 -> 2)) === Map(1 -> 1, 3 -> 2))
    assert(DeleteTheSame.deleteSame(Map(1 -> 1)) === Map(1 -> 1))
    assert(DeleteTheSame.deleteSame(Map(1 -> 4, 2 -> 6, 3 -> 4)) === Map(1 -> 4, 2 -> 6))
  }
}