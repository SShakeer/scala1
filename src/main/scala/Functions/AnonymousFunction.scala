package Functions

/**
 * Created by Basha on Mar, 2020
 **/


object AnonymousFunction {
  def main(args: Array[String]): Unit = {

   val sum=(c:Int,d:Int)=>(c+d)


    val output=sum(200,400)
    print(output)
    add2(200,400)
    def add2(x:Int,y:Int)=
      {
        println(x+y)
      }
  }
}
