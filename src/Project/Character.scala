package Project

abstract class Character(name: String){
  var name1: String = name
  var HP: Double
  val maxHP = 250
  val Fireball: Double = 40.0
  val Smite: Double = 20.0
  val Pin: Double = 30.0
  var location: Location = new Location(0, 0)
  var team: String = "None"
  var state: CharacterState =  new dead(this)
  def Damage(sustainDamage: String): Unit = {
    if (sustainDamage == "Fireball") {
      this.HP -= Fireball
    }
    if (sustainDamage == "Smite") {
      this.HP -= Smite
    }
    if (sustainDamage == "Pin") {
      this.HP -= Pin
    }
  }
  def Move(string: String): Unit = {
    if (string == "W") {
      this.location.y -= 1
    }
    if (string == "A") {
     this.location.x -= 1
    }
    if (string == "S") {
      this.location.y += 1
    }
    if (string == "D") {
      this.location.x += 1
    }
  }
  def pickUpPotion(potion: Potion): Unit = {
    if (this.location.x == potion.location.x && this.location.y == potion.location.y) {
      if (this.HP <= 100) {
        this.HP = this.HP + 50.0
      }
    }
  }
  def deathCheck(myCharacter: Character): String = {
    if (myCharacter.HP <= 0) {
      this.state = new dead(this)
      f"$name1 has been Killed"
    }
    else null
  }
  def spawn(loc: Location): Unit = {
   state.spawn(loc)
  }

}

