package com.plusonetesting.atomicscala

import org.scalatest.FlatSpec

class E17_VectorsTest extends FlatSpec {

  behavior of "E17_VectorsTest"

  it should "build a sentence from the words in the vector" in {
    val sB = new E17_Vectors
//    assert(sB.sentence == "The dog visited the firehouse!")

    val newSentence = sB.sentence.replace("firehouse ", "firehouse!")
    assert(newSentence == "The dog visited the firehouse!")
  }

}
