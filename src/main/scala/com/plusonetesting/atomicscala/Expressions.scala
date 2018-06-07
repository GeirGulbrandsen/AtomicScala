package com.plusonetesting.atomicscala

object Expressions extends App {

  val miles = {
    val feetPerMile = 5280
    val yardsPerMile:Double = feetPerMile/3
    2000/yardsPerMile
  }
  println(miles)

}
