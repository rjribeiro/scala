enum Shape {
  case Diamond, Squiggle, Oval
}

sealed trait NumberOfShapes

object NumberOfShapes:
  case object OneShape extends NumberOfShapes

  case object TwoShapes extends NumberOfShapes

  case object ThreeShapes extends NumberOfShapes

  val values = Array(OneShape, TwoShapes, ThreeShapes)

  def valuesOf(label: Int): NumberOfShapes =
    label match {
      case 1 => OneShape
      case 2 => TwoShapes
      case 3 => ThreeShapes
      case _ => throw new Exception("Invalid label")
    }

  def valueOf(label: String): NumberOfShapes =
    label match {
      case "OneShape" => OneShape
      case "TwoShapes" => TwoShapes
      case "ThreeShapes" => ThreeShapes
      case _ => throw new Exception("Invalid label")
    }


enum Shading {
  case Solid, Striped, Open
}


enum Color {
  case Red, Green, Blue
}


case class Card(shape: Shape, numberOfShapes: NumberOfShapes, shading: Shading, color: Color)

case class SetOfCards(card1: Card, card2: Card, card3: Card) {
  val isValidSet: Boolean =
    Set(1, 3).contains(Set(card1.numberOfShapes, card2.numberOfShapes, card3.numberOfShapes).size) &&
      Set(1, 3).contains(Set(card1.shape, card2.shape, card3.shape).size) &&
      Set(1, 3).contains(Set(card1.shading, card2.shading, card3.shading).size) &&
      Set(1, 3).contains(Set(card1.color, card2.color, card3.color).size)
}


val card1 = Card(Shape.Diamond, NumberOfShapes.OneShape, Shading.Solid, Color.Blue)
val card2 = Card(Shape.Oval, NumberOfShapes.TwoShapes, Shading.Open, Color.Red)
val card3 = Card(Shape.Squiggle, NumberOfShapes.ThreeShapes, Shading.Striped, Color.Green)
val card4 = Card(Shape.Oval, NumberOfShapes.ThreeShapes, Shading.Striped, Color.Green)



SetOfCards(card1, card2, card3).isValidSet
SetOfCards(card1, card2, card4).isValidSet