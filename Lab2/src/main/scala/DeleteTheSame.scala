object DeleteTheSame {
  def deleteSame(map: Map[Int, Int]): Map[Int,Int] =
    removeRepeting(map).toMap

  def removeRepeting(map: Map[Int, Int]): List[(Int, Int)] = {
    map.toList match {
      case Nil => Nil
      case _ => map.head :: removeRepeting(map.filter((f: (Int, Int)) => f._2 != map.head._2))
    }
  }
}
