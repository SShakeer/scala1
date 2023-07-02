package ControlStructures

object IfElseDemo {
  def main(args: Array[String]): Unit = {
    /*
    syntax:
    if(condition)
    {

    }else
    {}

     */
    val a=10;
    val b=20;
    val max=if(a > b) a else b
    println(max)
//print even or odd using if else
    val x=17
    if(x%2==0){
      println(x +" is even number")
    }
    else
      {
        println(x + " is Odd number")
      }
  }

}
