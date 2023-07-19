import scala.io.StdIn
object  A4_3{
    def main(args:Array[String])={
        println("Enter 1 to Capitalized all Letters")
        println("Enter 2 to Simplized all Letters")
        println("Enter 3 to Capitalized First Two Letters")
        println("Enter 4 to Capitalized First and last Letters\n")
        var input:Int=StdIn.readInt()
        input match
            case 1 =>toUpper()
            case 2 =>toLower()
            case 3 =>toFTL()
            case 4 =>toFLL()
            case _ => println("Invalid Input")

    }

    def toUpper()={
        println("Enter the Name to Capitalized all Letters\n")
        val get:String=StdIn.readLine()
        val out:String=get.toUpperCase()
        println("The Output--- "+out)

    }

    def toLower()={
        println("Enter The name Simplized all Letters\n")
        val get:String=StdIn.readLine()
        val out:String=get.toLowerCase()
        println("The Output--- "+out)

    }

    def toFTL()={
        println("Enter The Name Capitalized First Two Letters\n")
        val get:String=StdIn.readLine()
        if (get.length >= 2) {
             val firstTwoLetters = get.substring(0,2).toUpperCase
             val restOfString = get.substring(2)
             println("The Output--- "+firstTwoLetters+restOfString)
             println()
         } else {
             println("The Output--- "+get.toUpperCase)
                }
          


    }

    def toFLL()={
        println("Enter The Name Capitalized First and last Letters\n")
        val get:String=StdIn.readLine()
        if(get.length > 2 ){
              val FirstLetter=get.substring(0,1).toUpperCase
              val Middlepart=get.substring(1,get.length-1)
              val LastLetter=get.substring(get.length-1).toUpperCase()
              println("The Output--- "+FirstLetter+Middlepart+LastLetter)
        }
        else{
            
            println("The Output--- "+get.toUpperCase)
        }
      

    }



}