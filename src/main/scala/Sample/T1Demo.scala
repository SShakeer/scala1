package Sample

/**
 * Created by shakeer on Oct, 2020
 **/

//Traits contain both abstract and non-abstract methods and fields.
//it is same as interfaces in java or c#
//so what ever functions i have created in trait all functions should be implemented in body of class
//Trait allow multiple inheritances
//Constructor parameters are not allowed in Trait.
//using class we can extend only one parent class properties

//class sample extends parentclass

trait T1{
  def add
  def mul
}

trait T2{
  def sub
}

class cld extends T1 with T2{
  def add(): Unit ={
    println("addition")
  }
  def mul(): Unit ={
    println("multiplication")
  }
  def sub(): Unit ={
    println("substraction")
  }
}
object T1Demo {
  def main(args: Array[String]): Unit = {
 val obj=new cld
    obj.add()
    obj.mul()
    obj.sub()

  }
}
