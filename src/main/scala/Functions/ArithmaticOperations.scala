package Functions

/**
 * Created by Basha on Mar, 2020
 **/
object ArithmaticOperations {
  def main(args: Array[String]): Unit = {
    def arithmatic(a:Int,b:Int,operator:Char)={
      operator match{
        case '+' =>(a+b)
        case '-' =>(a-b)
        case '*' =>(a*b)
        case '_' => "DefaultCase"
      }
    }
    //calling
    println("Addition is "+arithmatic(100,100,'+'))
    println("Multiplication is "+arithmatic(100,100,'*'))
    println("Minus is "+arithmatic(400,100,'-'))
  }
}
