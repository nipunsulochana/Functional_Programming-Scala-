import scala.io.StdIn

object CaesarCipher {

  def encrypt(text: String): String = {


    if (text.isEmpty)
      ""
    else
      encryptChar(text.head) + encrypt(text.tail)
  }

  def encryptChar(ch: Char): Char = {
    
    if (ch.isLetter) {
      val base = if (ch.isUpper) 'A' else 'a'
      ((ch - base + 1) % 26 + base).toChar
    } else {
      ch
      }
  }

  def decrypt(text:String):String={

    if (text.isEmpty)
      ""
    else
      decryptChar(text.head) + decrypt(text.tail)
  }

      def decryptChar(ch:Char):Char={
      if (ch.isLetter) {
        val base = if (ch.isUpper) 'A' else 'a'
        ((ch - base - 1) % 26 + base).toChar
      } else {
        ch
      }
    }


  def main(args: Array[String]): Unit = {
    val text = StdIn.readLine("Enter text: ")
    println("Text : " + text)
    println("Encripted: " + encrypt(text))
    println("Decripted: " + decrypt(encrypt(text)))

  }
}