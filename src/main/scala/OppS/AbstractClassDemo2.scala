abstract class class1
{
  def m1()
  {
    println("m1 method")
  }
  def m2()
}
abstract class class2 extends class1
{
  def m3()
  {
    println("m3 method")
  }
}
class class3 extends class2
{
  def m2()
    {
    println("m2 method")
  }
}
object AbstractClassDemo2
{
  def main(args: Array[String])
  {
    val x = new class3()
    x.m1
    x.m2
    x.m3
  }
}