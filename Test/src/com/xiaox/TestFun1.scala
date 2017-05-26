package com.xiaox

// Unit类似于java中的void
object Test {
  def pri() = println("Hello World!")
  def max(x: Int, y: Int): Int = if (x > y) x else y
  //=>匿名函数声明方式
  val t = () => 333
  // 函数参数是一个函数，这种函数成为高阶函数
  //()表示无参，Int表示返回值类型Int
  //不写等号表示不需要返回值
  def testFun(c: () => Int) {
    println(c())
  }
  //写等号表示需要返回值,自行推断
  def testFun2(c: () => Int) = {
    println(c())
    1000
  }

  //匿名函数作为参数，其实就是参数名，后面跟上参数类型，然后是表达式
  def testf1(callback: (Int, Int) => Int) = {
    //这里有数据，外面提供计算方式
    callback(123, 123)
  }

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  def main(args: Array[String]): Unit = {
    //    pri()
    //    println(max(1,2))
    //    t()
    //    println(testFun(t))
    //    println(testFun2(t))
    testf1((a: Int, b: Int) => { println(a * b); a * b })
  }
}