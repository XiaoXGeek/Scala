package com.xiaox

object TestCollection {
  def main(args: Array[String]): Unit = {
    var t = List(1, 2, 3, 5, 5)
    //    println("---"+t(2)+"---")

    //map��λ����� ����ʽ���
    //    println(t.map(a=>{println("*****"+a);a+2}))
    //    println(t.map(_+1))

    //���Ԫ��
    var t2 = t.+:("test") // "+:"��Ҳ��һ��������6�Ĳ���
    //6�ŵ�����ǰ��
    //    println(6::t2)
    //    println(t2)
    //    t2 = t::6::Nil //����µ�List t��Ϊһ��Ԫ��
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
    //����Ԫ�����
//    println(t.reduce((x,y)=>x+y))
//    println(t.reduce(_+_))
   //Ԫ��
    var tuple01 = (1,2,3,5,5)
    println(tuple01._1)
     println(tuple01._3)
    
  }
}