package com.xiaox

object TestFun2 {

  def test1(): Unit = {
    for (i <- 1.to(100)) {
      println(i)
    }
  }

  def test2(): Unit = {
    for (i <- 1 to (100)) {
      println(i)
    }
  }

  def test3() = {
    for (i <- 0 to 100 if (i % 2) == 1; if (i % 5) > 3) {
      println("I: " + i)
    }
  }

  def test4(n: Int) = {
    n match {
      case 1 => { println("111"); n; }
      case 2 =>
        println("222"); n
      case _ => println("other"); "test"; //default
    }
  }
  def main(args: Array[String]): Unit = {
    //    test1()
    //    test2()
    //    test3()
    //    println(test4(2))
  }
}