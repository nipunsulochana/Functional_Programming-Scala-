import scala.io.StdIn
object A4_2{
    def main(args:Array[String])={
        println("Enter  the Number ");
        var input:Int=StdIn.readInt();
        if(input>0){
            println("The Number is Possitive")
            callc(input)
        }

        else if(input==0){
            println("The Number is Zero")

        }
        else{
            println("The Number is Negattive")
            callc(input)

        }



    }

    def callc(x: Int) = {
        if (x % 2 == 0) {
        println("The number is Even")
       } else {
       println("The number is Odd")
     }
 }



}