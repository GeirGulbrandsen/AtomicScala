package com.plusonetesting.atomicscala

class E16_ForLoops {
  val r1 = Range(0, 10)

  val r2: Range = 0 until 11
  val r3: Int = {
    var r4 = 0
    for (i <- r2) {
      r4 += i
    }
    r4
  }

  val r5: Int = {
    var r6 = 0
    for (i <- r2) {
      if (i % 2 == 0) {
        r6 += i
      }
    }
    r6
  }

  var r7 = 0
  var r8 = 0
  val r9: Int = {
    for (i <- r2) {
      if (i % 2 == 0) {
        r7 += i
      } else {
        r8 += i
      }
    }
    r7 + r8
  }
}
