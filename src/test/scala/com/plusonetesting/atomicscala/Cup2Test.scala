package com.plusonetesting.atomicscala

import org.scalatest.FlatSpec

class Cup2Test extends FlatSpec {

  behavior of "Cup2 from the Fields atom"

  it should "be initialised with percentFull = 0" in {
    val cup2 = new Cup2
    assert(cup2.getStatus == 0)
  }

  it should "be possible to fill the cup" in {
    val cup2 = new Cup2
    val status = cup2.add(10)
    assert(status == 10)
  }

  it should "return a correct status after being filled" in {
    val  cup2 = new Cup2
    cup2.add(50)
    assert(cup2.getStatus == 50)
  }

  it should "never be possible to fill to more than 100" in {
    val cup2 = new Cup2
    cup2.add(101)
    assert(cup2.getStatus == 100)
  }

  it should "be interesting to see what happens when we add negative amounts" in {
    val cup2 = new Cup2
    cup2.add(45)
    assert(cup2.getStatus == 45)
    cup2.add(-15)
    assert(cup2.getStatus == 30)
    cup2.add(-50)
    assert(cup2.getStatus == 0)

  }

  it should "properly handle negative input and never go below 0" in {
    val cup3 = new Cup2
    cup3.add(45)
    assert(cup3.getStatus == 45)
    cup3.add(-50)
    assert(cup3.getStatus == 0)
    cup3.add(10)
    assert(cup3.getStatus == 10)
    cup3.add(-9)
    assert(cup3.getStatus == 1)
    cup3.add(-2)
    assert(cup3.getStatus == 0)
  }

  it should "not be possible to set percentFull from outside the class" in {
    val cup4 = new Cup2
    cup4.add(56)
    assert(cup4.getStatus == 56)
  }
}
