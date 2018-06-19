package com.plusonetesting.atomicscala

object E12_MethodsInsideClasses extends App {

  class Sailboat {
    def raise(): Unit = {
      println("Sails raised")
    }

    def lower(): Unit = {
      println("Sails lowered")
    }
  }

  class Motorboat {
    def on(): Unit = {
      println("Motor on")
    }

    def off(): Unit = {
      println("Motor off")
    }
  }

  val sailboat = new Sailboat
  val r1 = sailboat.raise()
  assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)

}
