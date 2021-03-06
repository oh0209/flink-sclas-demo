package com.ghou.gramer.classtest

/**
 * @description: TODO
 * @author: OGH
 * @date: 2021-03-06 12:05
 */
object Demo01 {

  case class Calculate(a: Int, b: Int) {
    def add() = a + b;

    def subtract() = a - b;

    def multiply() = a * b;

    def divide() = a / b;
  }

  def main(args: Array[String]): Unit = {
    val c = Calculate(10, 3)
    println(c.add())
    println(c.subtract())
    println(c.multiply())
    println(c.divide())
  }
}
