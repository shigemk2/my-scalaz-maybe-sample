package com.example

import scalaz._
import std.option._, std.list._
import scalaz.Maybe

object Hello {
  def main(args: Array[String]): Unit = {
    val a = Some(3)
    a match {
      case a if a.isDefined => println(Maybe.Just.apply(a.get))
      case _ => println(Maybe.empty)
    }

    println("Hello, world!")
  }
}
