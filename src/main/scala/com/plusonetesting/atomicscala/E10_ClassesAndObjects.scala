package com.plusonetesting.atomicscala

object E10_ClassesAndObjects extends App {
  val r1 = Range(1, 5)
  println(r1.step)

  val r2 = Range(1, 10, 2)
  println(r2.step)

  val string = "This is an experiment"
  println(string.length)
  println(string.split(" ").length)

  var s1 = "Sally"
    var s2 = "Sally"
//  var s2 = "Sam"
  var s3 = s1.toUpperCase
//  var s3 = s1

  if (s1.equals(s2)) {
    println("s1 and s2 are equal")
  } else {
    println("s1 and s2 are not equal")
  }

  if (s1.contentEquals(s3)) {
    println("s1 and s3e ar equal")
  } else {
    println("s1 and s3 are not equal")
  }
}
