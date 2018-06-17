package com.plusonetesting.atomicscala

object E09_Methods extends App {

  def getSquare(toBeSquared: Int): Int = {
    toBeSquared * toBeSquared
  }

  def testSquare(toBeSquared: Int, expected: Int): Unit = {
    val a = getSquare(toBeSquared)
    assert(a == expected, "Expexted " + expected + ", got " + a)
  }

  testSquare(3, 9)
  testSquare(6, 36)
  testSquare(5, 25)

  def getSquareDouble(toBeSquared: Double): Double = {
    toBeSquared * toBeSquared
  }

  def testSquareDouble(toBeSquared: Double, expected: Double): Unit = {
    val a = getSquareDouble(toBeSquared)
    assert(a == expected, "Expexted " + expected + ", got " + a)
  }

  testSquareDouble(1.2, 1.44)
  testSquareDouble(5.7, 32.49)


  def isArg1GreaterThanArg2(thisOne: Double, thatOne: Double): Boolean = {
    thisOne > thatOne
  }

  def testIsArg1GreaterThanArg2(thisOne: Double, thatOne: Double, expected: Boolean): Unit = {
    val result: Boolean = isArg1GreaterThanArg2(thisOne, thatOne)
    assert(result == expected, "Expected " + expected + ", got " + result)
  }

  println(isArg1GreaterThanArg2(4.1, 4.12))
  testIsArg1GreaterThanArg2(4.1, 4.12, false)
  testIsArg1GreaterThanArg2(2.1, 1.2, true)


  def getMe(toConvert: String): String = {
    toConvert.toLowerCase
  }

  def testGetMe(toConvert: String, expected: String): Unit = {
    val result: String = getMe(toConvert)
    assert(result == expected, "Expexted " + expected + ",got " + result)
  }

  println(getMe("abraCaDabra"))
  testGetMe("abraCaDabra", "abracadabra")
  testGetMe("zyxwVUT", "zyxwvut")


  def addStrings(thisString: String, thatString: String): String = {
    thisString + thatString
  }

  def testAddStrings(thisString: String, thatString: String, expected: String): Unit = {
    val result: String = addStrings(thisString, thatString)
    println(result)
    assert(result == expected, "Expected " + expected + ",got " + result)
  }

  testAddStrings("abc", "def", "abcdef")
  testAddStrings("zyx", "abc", "zyxabc")

  def manyTimesString(thisString: String, times: Int): String = {
    thisString * times
  }

  def testManyTimesString(thisString: String, times: Int, expected: String): Unit = {
    val result: String = manyTimesString(thisString, times)
    println(result)
    assert(result == expected, "Expected " + expected + ",got " + result)
  }

  testManyTimesString("abc",3,  "abcabcabc")
  testManyTimesString("123",3,  "123123123")

  def bmiStatus(lbs: Double, height: Double): String = {
    val bmi = lbs / (height * height) * 703.07
    if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
  }

  def testBmiStatus(): Unit = {
    val normal: String = bmiStatus(160, 68)
    assert(normal == "Normal weight", "Expected Normal weight, got " + normal)
    val overweight: String = bmiStatus(180, 60)
    assert(overweight == "Overweight", "Expected Overweight, got " + overweight)
    val underweight: String = bmiStatus(100, 68)
    assert(underweight == "Underweight", "Expected Underweight, got " + underweight)
    println("bmiStatus = OK")
  }
  testBmiStatus()
}
