package Project

class projectile(speed: Double, projectileType: String) {
  var location: Location = _
  var spd = speed
  def detectHit(characters: List[Character]): Boolean ={
    var bool: Boolean = false
    for (character <- characters){
      if (math.abs((character.location - this.location).head) < 40 || math.abs((character.location - this.location)(1)) < 40){
        character.Damage(projectileType)
        this.location = null
        bool = true
      }
    }
    bool
  }
  def moveProjectile(mouseLocation: Location): Unit = {
    while (this.location.x < mouseLocation.x) {
      this.location.x = this.location.x + speed
    }
    while (this.location.y < mouseLocation.y) {
      this.location.y = this.location.y + speed
    }
    while (this.location.x > mouseLocation.x) {
      this.location.x = this.location.x - speed
    }
    while (this.location.y > mouseLocation.y) {
      this.location.y = this.location.y - speed
    }
  }
  def spawn(characterLocation: Character): Unit ={
    this.location = characterLocation.location
  }
}
