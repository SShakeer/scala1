package ControlStructures

/**
 * Created by shakeer on Nov, 2019
 **/
object CaseDemo2 {
  def main(args: Array[String]): Unit = {

    val name = "Vinod"
    val res = name match {
      case "Vinod" =>{println("He is Business Analyst")}
      case "Shakeer" =>{println("He is Hadoop Developer")}
      case "Madhavi" =>{println("She is DB Developer")}
      case _ => {println("Default case")}
    }

  }

}
