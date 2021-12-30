sealed trait Shape

case class Rectangle(width: Double, height: Double) extends Shape{
  val area: Double = width * height
}

case class Square(side: Double) extends Shape {
  val area: Double = side * side
}

case class Circle(radius: Double) extends Shape {
  val area: Double = math.Pi * radius * radius
}

val someShape: Shape = Circle(radius = 2)
//val otherShape: Shape = Rectangle(width = 2, height = 2)

//def area(shape: Shape): Double =
  someShape match {
    case circle: Circle => circle.area
    case _ => None
  }