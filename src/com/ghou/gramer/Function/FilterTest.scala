package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 16:26
 */
object FilterTest {

  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5,6,8,9)
    val l2 = (1 to 9).toList
    val l3 = l1.filter(_%2==0)
    println(l1)
    println(l2)
    println(l3)

    //排序
    println(l1.reverse.sorted)
  }

}
