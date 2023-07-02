package Functions

/**
 * Created by shakeer on Mar, 2020
 **/
//Def:decomposition of functions with multiple arguments into a chain of single-argument functions.
object CurryingDemo2 {
  def main(args: Array[String]): Unit = {
    def finalprice(vat:Double,serviceCharge:Double,Price:Double):Double=
      Price+Price*serviceCharge/100+Price*vat/100
   /* val vatapplied=finalprice(20)_
    val serviceApplied=vatapplied(13)
    val totalprice=serviceApplied(150)
    println(totalprice)*/
    println(finalprice(20,13,150))
  }
}
