package com.plusonetesting.atomicscala

object E12_MethodsInsideClasses extends App {

  class Sailboat {
    def raise(): String = {
      "Sails raised"
    }

    def lower(): String = {
      "Sails lowered"
    }
  }

  class Motorboat {
    def on(): String = {
      "Motor on"
    }

    def off(): String = {
      "Motor off"
    }
  }

  val sailboat = new Sailboat
  val r1 = sailboat.raise()
  assert(r1 == "Sails raised", "Expected Sails raised, got " + r1)

  val r2 = sailboat.lower()
  assert(r2 == "Sails lowered", "Expected Sails lowered, got " + r2)

  val motorboat = new Motorboat
  val s1 = motorboat.on()
  assert(s1 == "Motor on", "Expected Motor on, got " + s1)

  val s2 = motorboat.off()
  assert(s2 == "Motor off", "Expected Motor off, got " + s2)

  class Flare {

    def light(): String = {
      "Flare used!"
    }
  }

  val flare = new Flare
  val f1 = flare.light()
  assert(f1 == "Flare used!", "Expected Flare used!, got " + f1)

}
