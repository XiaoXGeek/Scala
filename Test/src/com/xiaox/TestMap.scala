package com.xiaox

object TestMap {
  def main(args: Array[String]): Unit = {
    //_ ͨ��� =>��������<- for ��������
    var m1 = Map[String, Int](("a", 1), ("b", 2))
    println(m1("a"))

    m1 += ("c" -> 3)
    println(m1)
    
    m1.foreach(a=>{
      println(a+" "+a._1+" "+a._2)
    })
    
    m1.keys.foreach(b=>println(m1(b)));
    println(m1)
  }
}