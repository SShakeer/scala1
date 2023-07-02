package OppS

/**
 * Created by shakeer on Jun, 2020
 **/
//Traits contain both abstract and non-abstract methods and fields.
//it is same as interfaces in java or c#
//so what ever functions i have created in trait all functions should be implemented in body of class
//Trait allow multiple inheritances
//Constructor parameters are not allowed in Trait.
trait T1100 {
  def addition100
  def substraction100
  def multiplication100
}
trait T2100{
  def mod
}
class child00 extends T1100 with T2100 {

  def addition100(): Unit = {
    println("addition")
  }

  def substraction100(): Unit = {
    println("substraction")
  }

  def multiplication100(): Unit = {

    println("multiply")
  }

  def mod(): Unit = {
    println("division")
  }
  object TraitDemo1 {
    def main(args: Array[String]): Unit = {
      val x1 = new child00()
      x1.addition100()
      x1.substraction100()
      x1.multiplication100()
      x1.mod
    }
  }

}
