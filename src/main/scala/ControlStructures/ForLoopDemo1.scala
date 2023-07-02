package ControlStructures

object ForLoopDemo1 extends App{
  /*
  for (identifier <- <starting integer> to/until <ending Integer>[inc/dec]
  {

  }
   */
 //for(i=1;i<=10;i++)
  for(i <- 1 to 10)
    {
      println(i)
    }

  //type2

 /* for (j <- 1 to 10 by 2){
    println(j)*/
  //}
  //type3

 /* for (k <-1 to 10){
    if(k%2==0){
      println(k)
    }
  }*/
  //type4

  for(a<- 1 to 10;if(a%2==0)){println(a)}

}
