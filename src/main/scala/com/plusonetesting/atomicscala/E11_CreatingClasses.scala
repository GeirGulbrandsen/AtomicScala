package com.plusonetesting.atomicscala

object E11_CreatingClasses extends App {

  class Hippo
  class Lion
  class Tiger
  class Monkey
  class Giraffe
  class Zebra {
    println("I have stripes")
  }

  val h1 = new Hippo
  val l1 = new Lion
  val l2 = new Lion
  val t1 = new Tiger
  val m1 = new Monkey
  val g1 = new Giraffe
  val g2 = new Giraffe
  val g3 = new Giraffe
  val z1 = new Zebra

  println(h1)
  println(l1)
  println(l2)
  println(t1)
  println(m1)
  println(g1)
  println(g2)
  println(g3)

}
