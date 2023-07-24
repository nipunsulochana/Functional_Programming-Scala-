object CaesarCipher {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = (base + (char - base + shift) % 26).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  def decrypt(encryptedText: String, shift: Int): String = {
    encrypt(encryptedText, -shift)
  }

  def cipher(text: String, shift: Int, cipherFunction: (String, Int) => String): String = {
    cipherFunction(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }
}
