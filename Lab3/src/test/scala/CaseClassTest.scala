import org.scalatest.FunSuite

class CaseClassTest extends FunSuite{
  test("CaseClass.chooseClass") {
    assert(CaseClass.chooseClass(new CaseClass.Granny("cat")) === "I am knit cat")
    assert(CaseClass.chooseClass(new CaseClass.Developer("scala")) === "I am work with scala")
    assert(CaseClass.chooseClass(new CaseClass.Manager(5)) === 6)
  }
}
