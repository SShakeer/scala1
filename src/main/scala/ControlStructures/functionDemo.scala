package ControlStructures

/**
 * Created by shakeer on Mar, 2020
 **/
object functionDemo {
  def main(args: Array[String]): Unit = {

    def samplefunction():Unit=
      {
        println("Welcome to Scala Functions")
      }

    def samplefunction2():Unit=
    {
      println("Welcome to Scala Functions")
    }

    def add1(x:Int,y:Int)=println(x+y)
    samplefunction()
    samplefunction2()
    add1(10,30)


  }
}
