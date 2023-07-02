package Functions

/**
 * Created by shakeer on Mar, 2020
 **/
object Currying {
  def main(args: Array[String]): Unit = {
    def finalPrice(vat: Double)(serviceCharge: Double)(productPrice: Double): Double =
      productPrice + productPrice*serviceCharge/100 + productPrice*vat/100
      val vatApplied = finalPrice(20) _
    val serviceChargeApplied = vatApplied(12.5)
    val finalProductPrice = serviceChargeApplied(120)
    println(finalProductPrice)

  }
}
