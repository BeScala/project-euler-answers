package org.bescala.projecteuler


object ProjectEuler {

  /**
   * Multiples of 3 and 5
   * If we list all the natural numbers below 10 that are multiples of 3 or 5,
   * we get 3, 5, 6 and 9. The sum of these multiples is 23.
   * Find the sum of all the multiples of 3 or 5 below 1000.
   */
  def problem001 = new Exercise {
    override def description: String =
      """
        |Multiples of 3 and 5
        |
        |If we list all the natural numbers below 10 that are multiples of 3 or 5,
        |we get 3, 5, 6 and 9. The sum of these multiples is 23.
        |Find the sum of all the multiples of 3 or 5 below 1000.
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 233168L == answer
  }

  //------------------------------------------------------------


  /**
   * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
   * By starting with 1 and 2, the first 10 terms will be:
   * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
   * find the sum of the even-valued terms.
   */
  def problem002 = new Exercise {
    override def description: String =
      """
        |  Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        |  By starting with 1 and 2, the first 10 terms will be:
        |
        |    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        |
        |  By considering the terms in the Fibonacci sequence whose values do not exceed four million,
        |  find the sum of the even-valued terms.
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 4613732L == answer
  }
  //------------------------------------------------------------


  /**
   * The prime factors of 13195 are 5, 7, 13 and 29.
   * What is the largest prime factor of the number 600851475143?
   */
  def problem003 = new Exercise {
    override def description: String =
      """
        |The prime factors of 13195 are 5, 7, 13 and 29.
        |What is the largest prime factor of the number 600851475143?
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 6857L == answer
  }

  //------------------------------------------------------------


  /**
   *  A palindromic number reads the same both ways. The largest palindrome made from the product
   *  of two 2-digit numbers is 9009 = 91 × 99.
   *
   *  Find the largest palindrome made from the product of two 3-digit numbers.
   *
   *  Note: for 5 digit numbers
   *  Largest palindrome is 9966006699 = 99681 * 99979 (Time to find: 669.271)
   */
  def problem004 = new Exercise {
    override def description: String =
      """
        | A palindromic number reads the same both ways. The largest palindrome made from the product
        |  of two 2-digit numbers is 9009 = 91 × 99.
        |
        |  Find the largest palindrome made from the product of two 3-digit numbers.
        |
        |  Note: for 5 digit numbers
        |    Largest palindrome is 9966006699 = 99681 * 99979 (Time to find: 669.271)
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 906609L == answer
  }

  //------------------------------------------------------------


  /**
   * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */
  def problem005 = new Exercise {
    override def description: String =
      """
        |2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        |What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 232792560L == answer
  }

  //------------------------------------------------------------


  /**
   * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
   */
  def problem006 = new Exercise {
    override def description: String =
      """
        |Find the difference between the sum of the squares of the
        |first one hundred natural numbers and the square of the sum
      """.stripMargin

    override def checkResult(answer: Long): Boolean = 25164150L == answer
  }

  //------------------------------------------------------------


  def problem007 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = 104743L == answer
  }

  //------------------------------------------------------------


  def problem008 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = 23514624000L == answer
  }

  //------------------------------------------------------------


  def problem009 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = 31875000L == answer
  }

  //------------------------------------------------------------


  def problem0010 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 142913828922L
  }

  def problem0011 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 70600674L
  }

  def problem0012 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 76576500L
  }

  def problem0013 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 5537376230L
  }

  def problem0014 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 837799L
  }

  def problem0015 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 137846528820L
  }

  def problem0016 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 1366L
  }

  def problem0017 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 21124L
  }

  def problem0018 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 1074L
  }

  def problem0019 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 171L
  }

  def problem0020 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 648L
  }

  def problem0021 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 31626L
  }

  def problem0022 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 871198282L
  }

  def problem0023 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 4179871L
  }

  def problem0024 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 2783915460L
  }

  def problem0025 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 4782L
  }

  def problem0026 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 983L
  }

  def problem0027 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == -59231L
  }

  def problem0028 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 669171001L
  }

  def problem0029 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 9183L
  }

  def problem0030 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 443839L
  }

  def problem0031 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 73682L
  }

  def problem0032 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 45228L
  }

  def problem0033 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 100L
  }

  def problem0034 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 40730L
  }

  def problem0035 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 55L
  }

  def problem0036 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 872187L
  }

  def problem0037 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 748317L
  }

  def problem0038 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 932718654L
  }

  def problem0039 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 840L
  }

  def problem0040 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 210L
  }

  def problem0041 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 7652413L
  }

  def problem0042 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 162L
  }

  def problem0043 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 16695334890L
  }

  def problem0044 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 5482660L
  }


  def problem0047 = new Exercise {
    override def description: String = "no description"
    override def checkResult(answer: Long): Boolean = answer == 134043L
  }

  def problem0048 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 9110846700L
  }

  def problem0049 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 296962999629L
  }

  def problem0050 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 997651L
  }

  def problem0065 = new Exercise {
    override def description: String = "no description"

    override def checkResult(answer: Long): Boolean = answer == 7273L
  }
}
