package Functions

/**
 * Created by shakeer on Mar, 2020
 **/
object FunctionReturnType {
  def main(args: Array[String]): Unit = {

    def summation(a:Int,b:Int):Int={
      return a+b
    }
    //calling
    println(summation(100,200))
  }
}
