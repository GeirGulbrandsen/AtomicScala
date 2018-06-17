package com.plusonetesting.atomicscala

object E05_ConditionalExpressions extends App {

  val a = 1
  val b = 5

  if (a < b) {
    println("a is less than b")
  } else {
    println("a is not less than b")
  }

  if (a < 2) {
    println("a is less than 2")
  }
  if (a > 2) {
    println("a is greater than 2")
  }
  if (b < 2) {
    println("b is less than 2")
  }
  if (b > 2) {
    println("b is greater than 2")
  }

  val c = 5

  if (a < c) {
    println("a is less than c")
  } else {
    println("a is not less than c")
  }

  if (b < c) {
    println("b is less than c")
  } else {
    println("b is not less than c")
  }

}
