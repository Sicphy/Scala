object WordSort {
  def sort(strings: List[String]): List[String] =
    strings.sortBy(_.length)
}


