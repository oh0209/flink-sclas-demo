package com.ghou.gramer.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 12:13
 */
object ArrayTest {

  def main(args: Array[String]): Unit = {
    //定义长度为10 的int类型数组
    val arr1 = new Array[Int](10)
    arr1(0) = 100
    println(arr1(0))
    //定义包含..的数组
    val arr2= Array("scala", "java", "python")
    println(arr2(1))

    println("变长数组-----------------------------")
    val arr3 = ArrayBuffer[Int]()
    val arr4 = ArrayBuffer("hadoop", "hbase","hive")
    println(s"arr3: ${arr3}")
    println(s"arr4: ${arr4}")
    arr3 += 1;
    println(s"arr3: ${arr3}")
    arr3 ++= Array(2,4)
    println(s"arr3: ${arr3}")

    //遍历数组

    for (i <- 0 to arr3.length-1){
      println(arr3(i))
    }

    for (i <- 0 until  arr3.length){
      println(arr3(i))
    }

    for (i<- arr3) println(i)
    println("数组的常用算法...................")
    println(s"sum: ${arr3.sum}")
    println(s"max: ${arr3.max}")
    println(s"min: ${arr3.min}")
    val arr5 = arr3.sorted.reverse
    for (i <- arr3) println(i)
    for (i <- arr5) println(i)


  }


}
