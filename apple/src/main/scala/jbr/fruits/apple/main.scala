package jbr.fruits.apple

import jbr.fruits.lib.FruitLib

  object AppleMain {
	val apple = new Apple()
  
    def main(args: Array[String]) {
      FruitLib.main(apple.fruitType)
    }
  }
