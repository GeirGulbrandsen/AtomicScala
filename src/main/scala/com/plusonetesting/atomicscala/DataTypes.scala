package com.plusonetesting.atomicscala

object DataTypes extends App {

  val int:Int = 5
  println(int)

  val ABC1234:String = "ABC1234"
  println(ABC1234)

  val double:Double = 5.4
  println(double)

  val boolean:Boolean = true
  println(boolean)

  val multiLine:String =
    """Ha ha this
      |is suuuuuper fantastic
      |and quite great!!!
    """.stripMargin
  println(multiLine)

//  val stringBoolean:Boolean = "maybe"
//  println(stringBoolean)

//  val doubleInInt:Int = 15.4
//  println(doubleInInt)

  val intInDouble:Double = 15
  println(intInDouble)
}
