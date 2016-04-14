package com.example

import monocle.Prism

import scalaz.Maybe

object Hello {
  def main(args: Array[String]): Unit = {
    val strToInt = Prism[String, Int] { str: String =>
      Maybe.fromTryCatchNonFatal(str.toInt).toOption
    }(_.toString)

    println(strToInt.getMaybe("3"))
    println(strToInt.getMaybe("")) // getMaybe is deprecated


    println("Hello, world!")
  }
}
