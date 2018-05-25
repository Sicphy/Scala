object Strings {
  def upgradeString(str: String): String =
    str.split(" ").filter(f => f.length <= 10).map(f => if(f.length <= 10 && f.length >= 5) f.substring(0, 3) else f).mkString(" ")
}


