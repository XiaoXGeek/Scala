package com.xiaox

// Unit������java�е�void
object Test {
  def pri() = println("Hello World!")
  def max(x: Int, y: Int): Int = if (x > y) x else y
  //=>��������������ʽ
  val t = () => 333
  // ����������һ�����������ֺ�����Ϊ�߽׺���
  //()��ʾ�޲Σ�Int��ʾ����ֵ����Int
  //��д�Ⱥű�ʾ����Ҫ����ֵ
  def testFun(c: () => Int) {
    println(c())
  }
  //д�Ⱥű�ʾ��Ҫ����ֵ,�����ƶ�
  def testFun2(c: () => Int) = {
    println(c())
    1000
  }

  //����������Ϊ��������ʵ���ǲ�������������ϲ������ͣ�Ȼ���Ǳ��ʽ
  def testf1(callback: (Int, Int) => Int) = {
    //���������ݣ������ṩ���㷽ʽ
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