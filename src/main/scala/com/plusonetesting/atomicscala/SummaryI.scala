package com.plusonetesting.atomicscala

object SummaryI extends App {

  val myInt: Int = 16
  println(myInt)

  //  myInt = 12

  var myOtherInt: Int = 12
  //  myOtherInt = 2.3

  val myDouble: Double = 15
  println(myDouble)

  //  val theTruth: Boolean = "maybe"

  val multiLine =
    """This is
      |a multiline
      |string.
      |A very
      |nice one too I might
      |add.
    """.stripMargin
  println(multiLine)

  //  val doubleInInt: Int = 15.4


  val lbs = 150.0
  val height = 68.0

  val weightStatus: Unit = {
    val bmi = lbs/(height * height) * 703.07
    if (bmi < 18.5) println("Underweight")
    else if (bmi < 25) println("Normal weight")
    else println("Overweight")

    val idealWeight = {
      22.0 * (height * height) / 703.07
    }
    println("Ideal weight: " + idealWeight)
  }

//  println(weightStatus)
}
