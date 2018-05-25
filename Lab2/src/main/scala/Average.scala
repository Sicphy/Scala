object Average {
  def averageList(list: List[Double]): Double = {
    list.fold(0.0)(_ + _) / list.size
  }
}
