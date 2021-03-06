package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 15:52
 */
object Foreach_ {

  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5);
//    l1.foreach((x:Int) => {println(x)})
//    l1.foreach(x=>println(x))

    l1.foreach(println(_))
  }

}
