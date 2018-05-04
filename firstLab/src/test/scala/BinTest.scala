import org.scalatest.FunSuite

class BinTest extends FunSuite {
  test("BinWithTailRec.bin") {
    assert(Bin.binWithTailRec(10) === "1010")
    assert(Bin.binWithTailRec(0) === "0")
    assert(Bin.binWithTailRec(458) === "111001010")
  }

  test("BinWithLoop.bin") {
    assert(Bin.binWithLoop(10) === "1010")
    assert(Bin.binWithLoop(0) === "0")
    assert(Bin.binWithLoop(458) === "111001010")
  }
}
