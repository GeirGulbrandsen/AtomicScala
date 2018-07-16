package com.plusonetesting.atomicscala

class E17_Vectors {

  val v1 = Vector("The", "dog", "visited", "the", "firehouse")

  var sentence = ""

  for (word <- v1) {
    println(word)
    sentence += word + " "
  }

  sentence.replace("firehouse ", "firehouse!")
}
