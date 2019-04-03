package Project

class Location(var x: Double, var y: Double) {
  def -(location: Location): List[Double] ={
    val xDif = this.x - location.x
    val yDif = this.y - location.y
    List(xDif, yDif)
  }
}