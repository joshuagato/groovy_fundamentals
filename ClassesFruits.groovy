class ClassesFruits {

  private String fruitName
  private String fruitColor

  def setFruitName(String name) {
    fruitName = name
  }

  def setFruitColor(String color) {
    fruitColor = color
  }

  def getFruitName() {
    return "Name of fruit is ${fruitName}"
  }

  def getFruitColor() {
    return "Color of fruit is ${fruitColor}"
  }

  static void main(args) {
    ClassesFruits fruit1 = new ClassesFruits()
    fruit1.setFruitName('Apple')
    fruit1.setFruitColor('Green')

    println fruit1.getFruitName()
    println fruit1.getFruitColor()
  }

}