package Functions

/**
 * Created by Basha on Mar, 2020
 **/
object FunctionwithDefaultArg {
  def main(args: Array[String]): Unit = {

    def func_default(a:Int,b:Int=1000): Unit ={
      println(a*b)
    }
    //calling
    val a=func_default(5)
    println(a)
    val b=func_default(5,3000)
    println(b)
  }
}
