package OppS

/**
 * Created by shakeer on Mar, 2020
 **/
class Employee(Empno:Int,Ename:String)
{
  def showDetails(): Unit =
  {
    println("Name is:"+Ename)
    println("Empno is :"+Empno)
  }
}

object ClassDemo1 {
  def main(args: Array[String]): Unit = {
    var emp=new Employee(1234,"Maheer")
    emp.showDetails()
  }
}
