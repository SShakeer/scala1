package OppS

/**
 * Created by Basha on Jun, 2020
 **/
class Addition
{
  def add (x: Int, y: Int) {
  println(x+y);
}
  def add (x: Int, y: Int, z: Int)
  {
    println(x+y+z);
  }
}
//Difference in the number of parameters.
object OverloadingDemo1 {
  def main (args: Array[String]) {
    val a = new Addition()
    a.add(200,200,10);
    a.add(50,50);
  }
}
