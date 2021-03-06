package com.ghou.gramer.collection

import scala.collection.mutable.{Map=>Mmmp}
/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 15:15
 */
object MapTest {

  def main(args: Array[String]): Unit = {
    val m1 = Map("zs"->22,"ls"-> 23,"ww"->33)
    println(m1)

    val m2 = Mmmp("a"->1,"b"->2)
    m2("a") =11
    println(m2)

    for ((k,v)<- m1) println(k,v)

    println(m1.getOrElse("wangwu",-1))
  }

}
