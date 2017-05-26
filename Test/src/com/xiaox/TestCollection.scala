package com.xiaox

object TestCollection {
  def main(args: Array[String]): Unit = {
    var t = List(1, 2, 3, 5, 5)
    //    println("---"+t(2)+"---")

    //map个位置相加 函数式编程
    //    println(t.map(a=>{println("*****"+a);a+2}))
    //    println(t.map(_+1))

    //添加元素
    var t2 = t.+:("test") // "+:"这也是一个方法，6的不行
    //6放到集合前面
    //    println(6::t2)
    //    println(t2)
    //    t2 = t::6::Nil //组成新的List t作为一个元素
    //     println(t2)

    //    t2.foreach { m => println(m) }

    //    println(t.distinct)
    //       println(t.slice(0,2))
    //       for(i<-0 to t2.length-1){
    //         println(i)
    //         println(t2(i))
    //       }
//    println(t./:(0)({
//      (sum,num)=>print(sum+"--"+num+"  ");
//      sum+num
//    }))
    //相邻元素相加
//    println(t.reduce((x,y)=>x+y))
//    println(t.reduce(_+_))
   //元组
    var tuple01 = (1,2,3,5,5)
    println(tuple01._1)
     println(tuple01._3)
    
  }
}