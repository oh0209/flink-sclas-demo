package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 20:32
 */
object Reduce_ {

  def main(args: Array[String]): Unit = {
    val l1 = (1 to 10).toList
    val l2 = l1.reduce((x,y)=> x+y)
    println(l2)
    val l3 = l1.reduce(_-_)
    println(l3)
    val l4 = l1.reduceLeft(_-_)
    val l5 = l1.reduceRight(_-_)
    println(l4)
    println(l5)

    val l6 = l1.fold(100)(_ + _)

    println(l6)
  }

}
