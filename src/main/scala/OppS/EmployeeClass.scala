package OppS

class emp
{
  var id:Int=1000;
  var ename:String="Maheer"
  var salary:Double=1990.00
  def method1(): Unit =
  {
    println("Id of employee is" +id)
    println("Employee name is " +ename)
  }
}

object EmployeeClass {
  def main(args: Array[String]): Unit = {
    val e=new emp()
    e.method1()

  }
}
