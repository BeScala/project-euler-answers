package org.bescala.projecteuler

trait EulerProblem {

  def number: Int
  def description : String
  def checkResult(answer:Long) : Boolean

}

