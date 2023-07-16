import scala.compiletime.ops.string

object A_3_1 {
  def main(args: Array[String]): Unit = {
    var name = input()
    println(revs(name))

  }

  def input(): String = {
    println("Enter the Input")
    val name = scala.io.StdIn.readLine()
    name
  }

  def revs(s: String): String = {
    if (s.length == 1) {
        s}
    else {
        revs(s.tail) + s.head
    }
    
    }
}
