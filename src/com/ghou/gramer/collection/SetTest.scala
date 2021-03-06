package com.ghou.gramer.collection
import scala.collection.mutable.Set
/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 15:10
 */
object SetTest {

  def main(args: Array[String]): Unit = {
    val s = Set(1,5,7,2)
    s += 10

    println(s)

    s --= Set(2,7)
    println(s)


  }
}
