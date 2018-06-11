package com.plusonetesting.atomicscala

object EvaluationOrder extends App {

  val sunny = false
  val partiallyCloudy = true
  val temperature = 15

  val nice: Boolean = {
    sunny && temperature > 80
  }
  println(nice)

  val alright: Boolean = {
    sunny || partiallyCloudy && temperature > 80
  }
  println(alright)

  val hotOrCold: Boolean = {
    sunny || partiallyCloudy && temperature > 80 || temperature < 20
  }
  println(hotOrCold)

  var f = 45.0

  val c: Double = {
    (f - 32) * 5.0/9.0
  }
  println(c)

  f = {
    c * 9/5 + 32
  }
  println(f)
}
