package ControlStructures

object YiledDemo {
  def main(args: Array[String]): Unit = {

    val a= for(i <- 1 to 10) yield (i*10)
    a.foreach(println)
  }
}
