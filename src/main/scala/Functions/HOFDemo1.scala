package Functions

/**
 * Created by Basha on Mar, 2020
 **/
//HOF: it can take function as argument or returns function as output
object HOFDemo1 {
  def main(args: Array[String]): Unit = {
    def doubler(value:Int):Int=value*10
    def addTen(value:Int):Int=value+10

    def hofdemo(start:Int,End:Int,f:Int=>AnyVal)={
      for(i<-start to End)
        println(f(i))
    }
    //calling
    println(hofdemo(2,10,addTen))
  }
}
