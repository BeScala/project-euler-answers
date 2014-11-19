package org.bescala.projecteuler

trait EulerProblem {
  def description : String
  def checkResult(answer:Long) : Boolean
}

