package com.plusonetesting.atomicscala

import org.scalatest.FlatSpec

class E16_ForLoopsTest extends FlatSpec {

  behavior of "E16_ForLoopsTest"

  it should "have a range object that goes from 0 to 10 (not including 10)" in {
    val ranges = new E16_ForLoops
    assert(ranges.r1 == (0 to 9))
    assert(ranges.r2 == (0 until 11))
  }

  it should "add all values in a range correctly" in {
    val ranges = new E16_ForLoops
    assert(ranges.r3 == 55)
  }

  it should "add all even values in a range correctly" in {
    val ranges = new E16_ForLoops
    assert(ranges.r5 == 30)
  }

  it should "add all even values in a range as well as adding odd numbers correctly" in {
    val ranges = new E16_ForLoops
    assert(ranges.r7 == 30)
    assert(ranges.r8 == 25)
    assert(ranges.r9 == 55)
  }


}
