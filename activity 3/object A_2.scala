object A_2 {
  def main(args: Array[String]): Unit = {
    val stringList = getStringListFromUser()
    val filteredStrings = filterStrings(stringList)
    println(filteredStrings)
  }

  def getStringListFromUser(): List[String] = {
    println("Enter strings (one per line). Enter 'done' to finish:")
    val strings = scala.collection.mutable.ListBuffer[String]()
    var input: String = ""

    while ((input.toLowerCase != "done")) {
      input = scala.io.StdIn.readLine()
      if (input.toLowerCase != "done") {
        strings += input
      }
    }

    strings.toList
  }

  def filterStrings(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }
}
