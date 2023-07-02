package Functions

/**
 * Created by shakeer on Mar, 2020
 **/
object NestedFunction {
  def main(args: Array[String]): Unit = {
    def max(x:Int,y:Int,z:Int)={

      def max2(x:Int,y:Int)={
        if(x>y) x else y
      }
      max2(x,max2(y,z))
    }
    println(max(10,20,30))
  }
}
