package com.jonathan.shamrock.jobs

object MainApp extends App {
  def greet(name: String): Unit = {
    println(s"Hello, $name!")
  }

  greet("Jonathan")
}
