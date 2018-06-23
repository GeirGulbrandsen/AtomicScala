package com.plusonetesting.atomicscala

import org.scalatest.FlatSpec

class E14_TestingTest extends FlatSpec {

  "A E14 object" should "be of class E14_Testing" in {
    val myTestObject = new E14_Testing
    assert(myTestObject.getClass.toString == "class com.plusonetesting.atomicscala.E14_Testing")
  }

  it should "Have a field named myValue1 with value 20" in {
    val myTestObject = new E14_Testing
    assert(myTestObject.myValue1 == 20)

  }

  it should "Have a second field named myValue2 with value 10" in  {
    val myTestObject = new E14_Testing
    assert(myTestObject.myValue2 == 10)
  }

  it should "Have a third field named myValue3 with value 10" in  {
    val myTestObject = new E14_Testing
    assert(myTestObject.myValue3 == 10)
  }

  it should "Have a fourth field named myValue4 with value 10" in  {
    val myTestObject = new E14_Testing
    assert(myTestObject.myValue4 == 10)
  }

  it should "Have a fifth field named myValue5 with the string '10'" in  {
    val myTestObject = new E14_Testing
    assert(myTestObject.myValue5 == myTestObject.myValue2.toString)
  }
}
