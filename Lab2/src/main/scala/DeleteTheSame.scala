object DeleteTheSame {
  def deleteSame(map: Map[Int, Int]): Map[Int,Int] = {
    remove(map.filter(f => f._2 != map.head._2), map.head)
  }

  def remove(map: Map[Int, Int], value:(Int,Int)): Map[Int, Int] = {
    if(map.isEmpty) map + (value._1 -> value._2)
    else remove(map.filter(f => f._2 != map.head._2), map.head) + value
  }
}
