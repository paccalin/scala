package example

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class implements a ScalaTest test suite for the methods in object `Lists` that need to be implemented as  part
 * of this assignment. A test suite is simply a collection of individual tests for some specific component of a program.
 *
 * A test suite is created by defining a class which extends the type`org.scalatest.FunSuite`. When running ScalaTest,
 * it will automatically find this class and execute all of its tests.
 *
 * Adding the `@RunWith` annotation enables the test suite to be executed inside eclipse using the built-in JUnit test runner.
 *
 * You have two options for running this test suite:
 * - Start the sbt console and run the "test" command
 * - Right-click this file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class lists extends FunSuite {
  /**
   * Tests are written using the `test` operator which takes two arguments:
   * - A description of the test. This description has to be unique, no two tests can have the same description.
   * - The test body, a piece of Scala code that implements the test
   *
   * The most common way to implement a test body is using the method `assert` which tests that its argument evaluates to `true`.
   *  So one of the simplest successful tests is the following:
   */
  test("one plus one is two")(assert(1 + 1 == 2))

  /**
   * In Scala, it is allowed to pass an argument to a method using the block syntax, i.e. `{ argument }` instead of parentheses
   * `(argument)`.
   *
   * This allows tests to be written in a more readable manner:
   */
  test("one plus two is three?") {
    assert(1 + 2 == 3)
  }

  /**
   * One problem with the previous (failing) test is that ScalaTest will only tell you that a test failed, but it will not tell you
   * what was the reason for the failure. The output looks like this:
   *
   * {{{
   *    [info] - one plus one is three? *** FAILED ***
   * }}}
   *
   * This situation can be improved by using a special equality operator `===` instead of `==` (this is only possible in ScalaTest).
   * So if you run the next test, ScalaTest will show the following output:
   *
   * {{{
   *    [info] - details why one plus one is not three *** FAILED ***
   *    [info]   2 did not equal 3 (ListsSuite.scala:67)
   * }}}
   *
   * We recommend to always use the `===` equality operator when writing tests.
   */
  test("details why one plus one is not three") {
    assert(1 + 1 !== 3)
  }

  /**
   * In order to test the exceptional behavior of a methods, ScalaTest offers the `intercept` operation.
   * In the following example, we test the fact that the method `intNotZero` throws an `IllegalArgumentException` if its argument is `0`.
   */
  test("intNotZero throws an exception if its argument is 0") {
    intercept[IllegalArgumentException] {
      intNotZero(0)
    }
  }

  def intNotZero(x: Int): Int =
    {
      if (x == 0) throw new IllegalArgumentException("zero is not allowed")
      else x
    }

  /**
   * Now we finally write some tests for the list functions that have to be implemented for this assignment. We fist import all members
   * of the `List` object.
   */
  import listsFun._

  /**
   * We only provide two very basic tests for you. Write more tests to make sure your `sum` and `max` methods work as expected.
   *
   * In particular, write tests for corner cases: negative numbers, zeros, empty lists, lists with repeated elements, etc.
   *
   * It is allowed to have multiple `assert` statements inside one test, however it is recommended to write an individual `test` statement
   * for every tested aspect of a method.
   */

  // TESTS Sum function
  test("sum of a few positif numbers") {
    assert(sum(List(1, 2, 0)) === 3)
  }

  test("sum of a few numbers") {
    assert(sum(List(1, 2, -3)) === 0)
  }

  test("sum of empty list") {
    assert(sum(List()) === 0)
  }

  // Max function
  test("max of a few numbers") {
    assert(max(List(1, 2, -3)) === 2)
  }
    // Max function
  test("max of a few numbers 1") {
    assert(max(List(56, 2, -3)) === 56)
  }
    // Max function
  test("max of a few numbers 2") {
    assert(max(List(-1, -2, -3)) === -1)
  }

  test("max throws an exception if the list is empty") {
    intercept[IllegalArgumentException] {
      max(List())
    }
  }

  // Revert function
  test("revert list") {
    assert(revert(List(1, 2, -3, 123, -255555, 5, 36)) === List(36, 5, -255555, 123, -3, 2, 1))
  }

  test("revert empty list") {
    assert(revert(List()) === Nil)
  }

  // Merge Function
  test("merge 2 lists") {
    assert(merge(List(1, 2, 3), List(4, 5, 6)).sorted === List(1, 2, 3, 4, 5, 6))
  }

  test("merge lists") {
    assert(merge(List(1, 2, 3), List(4, 5, 6)).sorted === List(1, 2, 3, 4, 5, 6))
  }

  test("merge lists 2 ") {
    assert(merge(List(1, 2, 0), List(4, 4, 1, 5)).sorted === List(0, 1, 2, 4, 5))
  }

  test("merge empty R lists") {
    assert(merge(List(1, 2, 0), List()).sorted === List(0, 1, 2))
  }

  test("merge empty L lists") {
    assert(merge(List(), List(1, 2, 0)).sorted === List(0, 1, 2))
  }

  test("merge same lists") {
    assert(merge(List(1, 2, 0), List(1, 2, 0)).sorted === List(0, 1, 2))
  }

  test("merge 2 empty lists") {
    assert(merge(List(), List()).sorted === List())
  }

  // Flatten Function
  test("flatten 2 lists") {
    assert(aplatir(List(1, List(2, 3, 4), 5, 6, List(7, 8, 9, List(10, 11, 12)))) === List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12))
  }

}
