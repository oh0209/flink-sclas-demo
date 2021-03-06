package com.ghou.gramer.Function

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 16:03
 */
object MapTest{
  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5)
    val l2 = l1.map((x:Int) => {"*"*x})
    println(l2)

    val l3 = l1.map(x=>"*"*x)
    println(l3)
    val l4 = l1.map("*" * _)
    println(l4)


    val list1 = List("hadoop hdfs yarn mapreduce","hive hbase flink spark")
    val list2 =list1.map(_.split(" ")).flatten
    val list3 = list1.flatten(_.split(" "))
    println(list1)
    println(list2)
    println(list3)

  }
}
