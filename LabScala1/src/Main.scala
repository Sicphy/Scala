import scala.annotation.tailrec

object Main extends App {
  var array = Array(45,12,65,2,300);
  println(bin.binWithTailRec(12));
  println(bin.binWithLoop(12));

  println(average.averageWithLoop(array));
  println(average.averageWithTailRec(array));
}

object bin {
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
    var tempN = n
    tempN /= 2
    while ( { tempN != 0 } ) {
      val temp = current.toString + prev
      prev = temp
      tempN /= 2
      current = tempN % 2
    }
    prev
  }
}

object average {
  def averageWithTailRec(array: Array[Int]): Int =
    if (array.length == 1) array(0)
    else averageIter(0, 0, array)

  @tailrec private def averageIter(count: Int, elem: Int, array: Array[Int]): Int =
    if (elem == array.length) (count / elem)
    else averageIter(count + array(elem), elem + 1, array)

  def averageWithLoop(array: Array[Int]): Int = {
    if (array.length == 1) return array(0)
    var count = 0
    var elem = 0
    while ( {elem != array.length}) {
      count += array(elem)
      elem += 1
    }
    count / elem
  }
}