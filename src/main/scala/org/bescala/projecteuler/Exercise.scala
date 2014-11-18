package org.bescala.projecteuler

trait Exercise {
  def description : String
  def checkResult(answer:Long) : Boolean
}

