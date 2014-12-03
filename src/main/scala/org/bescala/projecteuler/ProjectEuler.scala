package org.bescala.projecteuler


object ProjectEuler {

  def problem(num:Int) : EulerProblem = {

    val (desc, correctAnswer)  = problems(num)

    new EulerProblem {
      override def number: Int = num
      override def description: String = desc.stripMargin
      override def checkResult(answer: Long): Boolean = answer == correctAnswer
    }

  }
  private val problems = Map(
    1 ->(
      """
        |Multiples of 3 and 5
        |
        |If we list all the natural numbers below 10 that are multiples of 3 or 5,
        |we get 3, 5, 6 and 9. The sum of these multiples is 23.
        |Find the sum of all the multiples of 3 or 5 below 1000.
      """, 233168L),

    2 ->(
      """
        |Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        |By starting with 1 and 2, the first 10 terms will be:
        |
        |  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        |
        |By considering the terms in the Fibonacci sequence whose values do not exceed four million,
        |find the sum of the even-valued terms.
      """, 4613732L),

    3 ->(
      """
        |The prime factors of 13195 are 5, 7, 13 and 29.
        |What is the largest prime factor of the number 600851475143?
      """, 6857L),

    4 ->(
      """
        |A palindromic number reads the same both ways. The largest palindrome made from the product
        |of two 2-digit numbers is 9009 = 91 x 99.
        |
        |Task: Find the largest palindrome made from the product of two 3-digit numbers.
        |
        |Note: The stated problem can be solved for numbers with a larger number of digits.
        |
        |For example, for 5 digit numbers, the largest palindrome is 9966006699 = 99681 * 99979 and
        |this solution can be determined programmatically in under a second.
        |
        |In fact, it is possible to calculate the value of these palindrome for the product of two
        |numbers up-to 8 digits in around 5 seconds.
        |
        |Finding the right strategy for finding a fast solution is not straightforward. Use experiments to
        |find a good strategy. The 'fast' solution doesn't require tons of math...
      """, 906609L),

    5 ->(
      """
        |2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        |What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
      """, 232792560L),

    6 ->(
      """
        |Find the difference between the sum of the squares of the
        |first one hundred natural numbers and the square of the sum
      """, 25164150L),

    7 ->(
      """
        |By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        |What is the 10 001st prime number?
      """, 104743L),

    8 ->(
      """
        |The four adjacent digits in the 1000-digit number that have the greatest product are 9 x 9 x 8 x 9 = 5832.
        |
        | 73167176531330624919225119674426574742355349194934
        | 96983520312774506326239578318016984801869478851843
        | 85861560789112949495459501737958331952853208805511
        | 12540698747158523863050715693290963295227443043557
        | 66896648950445244523161731856403098711121722383113
        | 62229893423380308135336276614282806444486645238749
        | 30358907296290491560440772390713810515859307960866
        | 70172427121883998797908792274921901699720888093776
        | 65727333001053367881220235421809751254540594752243
        | 52584907711670556013604839586446706324415722155397
        | 53697817977846174064955149290862569321978468622482
        | 83972241375657056057490261407972968652414535100474
        | 82166370484403199890008895243450658541227588666881
        | 16427171479924442928230863465674813919123162824586
        | 17866458359124566529476545682848912883142607690042
        | 24219022671055626321111109370544217506941658960408
        | 07198403850962455444362981230987879927244284909188
        | 84580156166097919133875499200524063689912560717606
        | 05886116467109405077541002256983155200055935729725
        | 71636269561882670428252483600823257530420752963450
        |
        |Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
      """, 23514624000L),

    9 ->(
      """
        |A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        |
        |a^2 + b^2 = c^2
        |For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
        |
        |There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        |Find the product abc.
      """, 31875000L),

    10 ->(
      """
        |The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        |
        |Find the sum of all the primes below two million
      """, 142913828922L),

    11 ->(
      """
        |In the 20x20 grid below, four numbers along a diagonal line have been marked in red.
        |
        |08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
        |49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
        |81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
        |52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
        |22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
        |24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
        |32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
        |67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
        |24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
        |21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
        |78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
        |16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
        |86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
        |19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
        |04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
        |88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
        |04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
        |20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
        |20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
        |01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
        |
        |The product of these numbers is 26 x 63 x 78 x 14 = 1788696.
        |
        |What is the greatest product of four adjacent numbers in the same direction
        |(up, down, left, right, or diagonally) in the 20x20 grid?
      """, 70600674L),

    12 ->(
      """
        |The sequence of triangle numbers is generated by adding the natural numbers.
        |So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
        |
        |1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
        |
        |Let us list the factors of the first seven triangle numbers:
        |
        | 1: 1
        | 3: 1,3
        | 6: 1,2,3,6
        |10: 1,2,5,10
        |15: 1,3,5,15
        |21: 1,3,7,21
        |28: 1,2,4,7,14,28
        |We can see that 28 is the first triangle number to have over five divisors.
        |
        |What is the value of the first triangle number to have over five hundred divisors?
      """, 76576500L),

    13 ->(
      """
        |Work out the first ten digits of the sum of the following one-hundred 50-digit numbers (see val BigNumbers below)
      """, 5537376230L),
    14 ->(
      """
        |Longest Collatz sequence
        |
        |The following iterative sequence is defined for the set of positive integers:
        |
        |n → n/2 (n is even)
        |n → 3n + 1 (n is odd)
        |
        |Using the rule above and starting with 13, we generate the following sequence:
        |
        |13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
        |It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
        |Although it has not been proved yet (Collatz Problem), it is thought that all starting
        |numbers finish at 1.
        |
        |Which starting number, under one million, produces the longest chain?
      """, 837799L),

    15 ->(
      """
        |Starting in the top left corner of a 2x2 grid, and only being able to move to the right and down,
        |there are exactly 6 routes to the bottom right corner.
        |
        |How many such routes are there through a 20x20 grid?
      """, 137846528820L),

    16 ->(
      """
        |215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        |                                             1000
        |What is the sum of the digits of the number 2    ?
      """, 1366L),

    17 ->(
      """
        |If the numbers 1 to 5 are written out in words: one, two, three, four, five,
        |then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
        |
        |If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
        |
        |NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
        |contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
        |The use of "and" when writing out numbers is in compliance with British usage.
      """, 21124L),

    18 ->(
      """
        |By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total
        |  from top to bottom is 23.
        |
        |     3
        |    7 4
        |   2 4 6
        |  8 5 9 3
        |
        |  That is, 3 + 7 + 4 + 9 = 23.
        |
        |  Find the maximum total from top to bottom of the triangle below:
        |
        |                              75
        |                            95 64
        |                          17 47 82
        |                        18 35 87 10
        |                      20 04 82 47 65
        |                    19 01 23 75 03 34
        |                  88 02 77 73 07 63 67
        |                99 65 04 28 06 16 70 92
        |              41 41 26 56 83 40 80 70 33
        |            41 48 72 33 47 32 37 16 94 29
        |          53 71 44 65 25 43 91 52 97 51 14
        |        70 11 33 28 77 73 17 78 39 68 17 57
        |      91 71 52 38 17 14 91 43 58 50 27 29 48
        |    63 66 04 68 89 53 67 30 73 16 69 87 40 31
        |  04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
        |
        |  NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route.
        |  However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot
        |  be solved by brute force, and requires a clever method! ;o)
      """, 1074L),

    19 ->(
      """
        |You are given the following information, but you may prefer to do some research for yourself.
        |
        |1 Jan 1900 was a Monday.
        |Thirty days has September,
        |April, June and November.
        |All the rest have thirty-one,
        |Saving February alone,
        |Which has twenty-eight, rain or shine.
        |And on leap years, twenty-nine.
        |A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
        |
        |How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
      """, 171L),

    20 ->(
      """
        |n! means n x (n - 1) x ... x 3 x 2 x 1
        |
        |For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
        |and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
        |
        |Find the sum of the digits in the number 100!
      """, 648L),

    21 ->(
      """
        |Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
        |
        |If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
        |
        |For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
        |The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
        |
        |Evaluate the sum of all the amicable numbers under 10000.
      """.stripMargin, 31626L),

    22 ->(
      """
        |add description
      """, 871198282L),

    23 ->(
      """
        |add description
      """, 4179871L),

    24 ->(
      """
        |A permutation is an ordered arrangement of objects.
        |For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
        |
        |If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
        |The lexicographic permutations of 0, 1 and 2 are:
        |
        |  012   021   102   120   201   210
        |
        |What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
      """, 2783915460L),

    25 ->(
      """
        |The Fibonacci sequence is defined by the recurrence relation:
        |
        |  F(n) = F(n - 1) + F(n - 2), where F(1) = 1 and F(2) = 1.
        |  Hence the first 12 terms will be:
        |
        |  F1  = 1
        |  F2  = 1
        |  F3  = 2
        |  F4  = 3
        |  F5  = 5
        |  F6  = 8
        |  F7  = 13
        |  F8  = 21
        |  F9  = 34
        |  F10 = 55
        |  F11 = 89
        |  F12 = 144
        |
        |  The 12th term, F12, is the first term to contain three digits.
        |
        |  What is the first term in the Fibonacci sequence to contain 1000 digits?
      """, 4782L),

    26 ->(
      """
        |add description
      """, 983L),

    27 ->(
      """
        |add description
      """, -59231L),

    28 ->(
      """
        |add description
      """, 669171001L),

    29 ->(
      """
        |add description
      """, 9183L),

    30 ->(
      """
        |add description
      """, 443839L),

    31 ->(
      """
        |add description
      """, 73682L),

    32 ->(
      """
        |add description
      """, 45228L),

    33 ->(
      """
        |add description
      """, 100L),

    34 ->(
      """
        |add description
      """, 40730L),

    35 ->(
      """
        |add description
      """, 55L),

    36 ->(
      """
        |add description
      """, 872187L),

    37 ->(
      """
        |add description
      """, 748317L),

    38 ->(
      """
        |add description
      """, 932718654L),

    39 ->(
      """
        |add description
      """, 840L),

    40 ->(
      """
        |add description
      """, 210L),

    41 ->(
      """
        |add description
      """, 7652413L),

    42 ->(
      """
        |add description
      """, 162L),

    43 ->(
      """
        |add description
      """, 16695334890L),

    44 ->(
      """
        |add description
      """, 5482660L),


    47 ->(
      """
        |add description
      """, 134043L),

    48 ->(
      """
        |add description
      """, 9110846700L),

    49 ->(
      """
        |add description
      """, 296962999629L),

    50 ->(
      """
        |add description
      """, 997651L),

    65 ->(
      """
        |add description
      """, 7273L)

  )


}
