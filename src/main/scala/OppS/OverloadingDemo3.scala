package OppS

/**
 * Created by Basha on Jun, 2020
 **/
//Difference in the order or sequence of parameters

class Addition03
{
  def add03(a: Int, b: Float) { println(a+b); }
  def add03(a: Float, b: Int) { println(a+b); }
}
object OverloadingDemo3 {
  def main(args: Array[String]): Unit = {
    val obj = new Addition03();
    obj.add03(50, 50.0f)
    obj.add03(100.0f, 20)
  }
}