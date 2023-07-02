package OppS

/**
 *
 **/

class C1
{
  def sample(): Unit =
  {
    println("Welcome to zero parameterized methods")
  }
}
object Mehod1Demo {
  def main(args: Array[String]): Unit = {
    val s=new C1()
    s.sample()
    s.sample
  }
}
