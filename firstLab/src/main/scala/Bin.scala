import scala.annotation.tailrec

object Bin {
    def binWithTailRec(n: Integer): String =
      if (n > 1) binIter((n % 2).asInstanceOf[Integer].toString, (n / 2) % 2, n / 4)
      else n.toString

    @tailrec private def binIter(prev: String, current: Integer, n: Integer):String =
      if (n == 0) current.toString + prev
      else binIter(current.toString + prev, n % 2, n / 2)

    def binWithLoop(n: Integer): String = {
      if (n <= 1) return n.toString
      var prev = (n % 2).asInstanceOf[Integer].toString
      var current = (n / 2) % 2
      var thisNumber = n
      thisNumber /= 2
      while ( { thisNumber != 0 } ) {
        prev = current.toString + prev
        thisNumber /= 2
        current = thisNumber % 2
      }
      prev
    }
}
