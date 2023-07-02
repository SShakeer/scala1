package OppS

/**
 * Created by shakeer on Jun, 2020
 **/
// Creating a sub class from multiple super classes is called multiple inheritance
class AA {
  var x: Int = 1000
}
class BB
{
  var x: Int = 2000
}
class CC extends BB//, AA
{

}
object multipleInheritance2 {
  def main(args: Array[String]): Unit = {
    val c = new CC()
    print(c.x)
  }
}
