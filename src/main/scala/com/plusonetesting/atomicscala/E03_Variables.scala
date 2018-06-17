package com.plusonetesting.atomicscala

object E03_Variables extends App {

  var integer: Int = 5
  integer = 10

  var v1:Int = 5
  v1 = 10
  val constantv1:Int = v1
  println(constantv1)

  v1 = 15
  println(constantv1)

  var v2:Int = v1
  println(v2)

  v1 = 20
  println(v2)
}
