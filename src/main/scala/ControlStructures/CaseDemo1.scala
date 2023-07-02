package ControlStructures

/**
 * Created by shakeer on Nov, 2019
 **/

  /*
val variable = <condition/expression> match {
case <expression> => {     }
case <expression> => {     }
}
*/

object CaseDemo1 {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=20
    val output=a > b match {
      case true => println(" a is greater")
      case false => println(" b is greater")
      case _ => println("Default case")
    }
  }
}
