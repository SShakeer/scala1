package Functions

/**
 * Created by Basha on Mar, 2020
 **/
object VariableArgFun {
  def main(args: Array[String]): Unit = {

    def sum(args:Int*):Int={
      var i=0
      for(args <-args){
        i+=args
      }
      i
    }
   //calling
    println(sum(12))
    println(sum(10,20,30))
    println(sum(1,2,3,4,5,6))
  }
}
