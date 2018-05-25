import org.scalatest.FunSuite

class StringsTest extends FunSuite{
  test("Strings.upgradeString") {
    assert(Strings.upgradeString("Privet aaaaaaaaaaaaa kak ti seven bbbbbbbbbbbbbbbb") === "Pri kak ti sev")
    assert(Strings.upgradeString("aaaaaaaaaaaaaaaaaaaaaaaa vbbbbbbbbbbbbbbbbbbbbbbbbb") === "")
    assert(Strings.upgradeString("kak takto dada") === "kak tak dada")
  }
}
