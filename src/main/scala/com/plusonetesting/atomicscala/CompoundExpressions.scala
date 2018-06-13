package com.plusonetesting.atomicscala

object CompoundExpressions extends App {
  val a = 1
  val b = 6
  val c = 5


  if ((a <= c) && (b <= c)) println("Both are")
  else if ((a <= c) || (b <= c)) println("one is and one isn't")


  var activity = "couch"
  val hour = 8
  val temp = 10

  val isOpen: Boolean = {
    if (activity == "swimming" || activity == "ice skating") {
      val opens = 9
      val closes = 20
      println("Operating hours: " + opens + " - " + closes)
      (hour >= opens && hour <= closes)
    } else {
      false
    }
  }
  println(isOpen)

  val goodTemperature: Boolean = {
    var minTemp = 0
    var maxTemp = 0
    if (activity == "swimming" || activity == "ice skating") {
      minTemp = 19
      maxTemp = 35
    } else if (activity == "walking") {
      minTemp = 5
      maxTemp = 30
    } else if (activity == "biking") {
      minTemp = 15
      maxTemp = 25
    } else if (activity == "couch") {
      minTemp = 0
      maxTemp = 40
    }
    temp >= minTemp && temp <= maxTemp
  }
  println(goodTemperature)

  val doActivity = isOpen && goodTemperature

  println(activity + ": " + isOpen + " && " + goodTemperature + " = " + doActivity)

  val distance = 9
  activity = "swimming"

  val willDo = {
    if (activity == "running") {
      println(activity + ": " + (distance < 6))
    }else if (activity == "biking") {
      println(activity + ": " + (distance < 20))
    } else if (activity == "swimming") {
      println(activity + ": " + (distance < 1))
    }
  }

}
