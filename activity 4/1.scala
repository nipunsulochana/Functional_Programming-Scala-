import scala.compiletime.ops.string
import scala.io.StdIn
object A4_1{
    def main(args : Array[String])={
        printf("Enter the Amoount you wish to diposit \n")
        var input: Double=StdIn.readDouble()
        if(input < 20000){
            calculate(2,input)
        }
        else if (input < 200000){
             calculate(4,input)
        }

        else if(input < 2000000){
            calculate(3.5,input)
        }

        else{
            calculate(6.5,input)
        }
           
          


    }

    def calculate(pre:Double,vall:Double)={
        var interest:Double =pre*0.01*vall;
        var tot:Double=vall+interest;
        println("The interst amount:  "+interest)
        println("The total amount you get At the end the year:  "+tot);

    }

}
