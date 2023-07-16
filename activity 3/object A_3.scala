object A_2

def main(args:Array[String]):Unit={
    val num1=getnumber1()
    val num2=getnumber2()
    val result = calculateArithmeticMean(num1,num2)
    println("The Average")
    println(f"$result%.2f") 

}

def getnumber1():Int={
    println("Enter the first number")
    val num1 = scala.io.StdIn.readInt()
    num1   
}

def getnumber2():Int={
    println("Enter the second number")
    val num2 = scala.io.StdIn.readInt()
    num2
}


def calculateArithmeticMean(num1: Int, num2: Int): Double = {
    val sum= num1+num2
    val average = sum.toFloat/ 2
    average
    

}


