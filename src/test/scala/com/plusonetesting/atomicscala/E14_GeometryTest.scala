package com.plusonetesting.atomicscala

import org.scalatest.FlatSpec

class E14_GeometryTest extends FlatSpec {

  behavior of "the E14 calculator"

  it should "return the area of a square with given side" in {
    val calculator = new E14_Testing
    assert(calculator.squareArea(1) == 1)
    assert(calculator.squareArea(2) == 4)
    assert(calculator.squareArea(5) == 25)
  }

  it should "return the area of a rectangle with given length and height" in {
    val calculator = new E14_Testing
    assert(calculator.rectangleArea(2, 2) == 4)
    assert(calculator.rectangleArea(5, 4) == 20)
  }

  it should "return the area of a trapezoid with given length, width, and height" in {
    val calculator = new E14_Testing
    assert(calculator.trapezoidArea(2, 2, 4) == 8)
    assert(calculator.trapezoidArea(3, 4, 1) == 3.5)
  }


}
