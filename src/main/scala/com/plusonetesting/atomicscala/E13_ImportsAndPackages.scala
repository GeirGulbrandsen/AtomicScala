package com.plusonetesting.atomicscala

import com.atomicscala.pythegorean._
import com.plusonetesting.dummypackage._
//import com.plusonetesting.dummypackage.DummyClass1
//import com.plusonetesting.dummypackage.{DummyClass1, DummyClass2}
//import com.plusonetesting.dummypackage.{DummyClass1, DummyClass2, DummyClass3}

object E13_ImportsAndPackages extends App {

  val rt = new RightTriangle
  println(rt.hypotenuse(3, 4))
  println(rt.area(3, 4))
  assert(rt.hypotenuse(3, 4) == 5)
  assert(rt.area(3, 4) == 6)

  val et = new EquilateralTriangle
  println(et.area(3))
  assert(et.area(3) == 3.897114317029974)

  val d1 = new DummyClass1
  println(d1)
  val d2 = new DummyClass2
  println(d2)
  val d3 = new DummyClass3
  println(d3)
}
