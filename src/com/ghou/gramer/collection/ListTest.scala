package com.ghou.gramer.collection

import scala.collection.mutable.ListBuffer

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 13:35
 */
object ListTest {

  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,"haha")
    for(i <- list1) println(i)
    val l2 = Nil
    println(list1)
    val  l3 = 2 :: 3 :: Nil
    println(l3)

    //可变列表
    val l4 = ListBuffer[Int]()
    val l5 = ListBuffer(11,3,4,55)
    println(l4)
    println(l5)

    val l6 =l4.toList
    println(l6)

    l5(2) = 33
    println(l5)
    l5 ++= List(90,89)
    println(l5)
    l5 --= List(3)
    println(l5)
    //转数组
    val arr = l5.toArray
    println(arr)
    for(i<- arr) println(i)

    println(l5.toString())

    val l7 = l3 ++ l5

    println(l7)

    val list2 = List("zhangsan","lisi", "wangwu")
    val list3 = List(22,23,24)
    val list4 = list2.zip(list3)
    val list5 = list4.unzip
    println(list4)
    println(list4.unzip)


  }



}
