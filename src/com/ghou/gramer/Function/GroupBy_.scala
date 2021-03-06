package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 16:46
 */
object GroupBy_ {

  def main(args: Array[String]): Unit = {

    val l1 = List("男"->"刘德华", "男"->"郭副总", "女"->"嘉玲")

    val m1 = l1.groupBy(_._1)

//    val m2 = m1.map(x => (x._1,x._2.size))
    val m2 = m1.map(x=>x._1 -> x._2)
    println(m2)

  }

}
