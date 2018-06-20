package com.plusonetesting.atomicscala

import com.atomicscala.pythegorean.{EquilateralTriangle, RightTriangle}

object E13_ImportsAndPackages extends App {

  val rt = new RightTriangle
  println(rt.hypotenuse(3, 4))
  println(rt.area(3, 4))
  assert(rt.hypotenuse(3,4) == 5)
  assert(rt.area(3,4) == 6)

  val et = new EquilateralTriangle
  println(et.area(3))
  assert(et.area(3) == 3.897114317029974)

}
