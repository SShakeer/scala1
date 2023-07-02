package Functions

/**
 * Created by Basha on Mar, 2020
 **/
object PAFDemo {
  def main(args: Array[String]): Unit = {
   def multiplication(a:Int)(b:Int)(c:Int)=a*b*c
    var output=multiplication(10)(20)(_)
    println(output(30))
  }
}
