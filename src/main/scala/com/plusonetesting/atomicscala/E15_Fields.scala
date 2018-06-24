package com.plusonetesting.atomicscala

class Cup2 {
  private var percentFull = 0
  val max = 100

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    } else if (percentFull < 0) {
      percentFull = 0
    }
    percentFull
  }

def getStatus: Int = {
  percentFull
}

}
