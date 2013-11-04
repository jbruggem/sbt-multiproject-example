package jbr.fruits.apple

import org.scalatest.FunSuite

class AppleTest extends FunSuite{

	test("apple is not a peach") {
	  val apple = new Apple()
	  assert("peach" != apple.fruitType)
	}
  
	test("create an apple") {
	  val apple = new Apple()
	  assert(true === apple.isFruit)
	}
  
}