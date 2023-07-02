package OppS

/**
 * Created by Basha on Jun, 2020
 **/
abstract class class2
{
  var x: Int
}
class class3 extends class2
{
  var x: Int = 1000;
  def m1()
  {
    println(x)
  }
}
object AbstractVariableDemo1 {
  def main(args: Array[String]): Unit = {
    val i = new class3()
    i.m1()
  }
}
