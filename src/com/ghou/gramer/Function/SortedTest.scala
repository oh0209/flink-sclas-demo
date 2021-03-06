package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 16:34
 */
object SortedTest {

  def main(args: Array[String]): Unit = {

    val l1 = List("01 hadoop","02 flume", "03 spark" ,"04 hive")
    //指定字段排序
    val l2 = l1.sortBy(x => x.split(" ")(1))
    println(l2)

    //自定义排序
    val l3 = List(2,3,5,1,12,9)
//    val l4 = l3.sortWith((x,y)=> x>y)
    val l4 = l3.sortWith(_>_)
    println(l4)
  }

}
