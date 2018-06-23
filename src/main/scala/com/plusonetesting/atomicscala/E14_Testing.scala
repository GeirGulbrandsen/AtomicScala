package com.plusonetesting.atomicscala

class E14_Testing {
  def squareArea(side: Int): Int = {
    rectangleArea(side, side)
  }

  def rectangleArea(height: Int, length: Int): Int = {
    height * length
  }

  def trapezoidArea(length: Int, width: Int, height: Double): Double = {
    height / 2 * (length + width)
  }

  var myValue1 = 20
  var myValue2 = 10
  var myValue3 = 10
  var myValue4 = 10

  var myValue5 = "10"
  println("This is Testing!")

}
