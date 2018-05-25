import org.scalatest.FunSuite

class WordSortTest extends FunSuite{
  test("WordSort.sort") {
    assert(WordSort.sort(List("aaa", "aaaaaa", "a", "aaaa")) === List("a", "aaa", "aaaa", "aaaaaa"))
    assert(WordSort.sort(List("a")) === List("a"))
    assert(WordSort.sort(List("aaaaaaa", "aaaa")) === List("aaaa", "aaaaaaa"))
  }
}