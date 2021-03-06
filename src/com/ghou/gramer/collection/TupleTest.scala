package com.ghou.gramer.collection

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 13:27
 */
object TupleTest {

  def main(args: Array[String]): Unit = {

    //元组定义
    val t1 =("张三", 34)
    val t2 = "李四"->22

    println(t1)
    println(t2)

    //元组遍历

    println(t1._1)
    println(t1._2)
    val it = t2.productIterator

    for (i<- it) println(i)
  }
}
