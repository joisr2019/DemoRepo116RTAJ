package Project

object Game {
  val Fireball: Double = 40.0
  val Smite: Double = 20.0
  val Pin: Double = 30.0
  var lastUpdateTime: Long = System.nanoTime()
  def CharacterSelect(name: String, myClass: String, team: String): Character = {
    var character: Character = new Wizard(name)
    if (myClass == "Wizard") {
      character = new Wizard(name)
    }
    if (myClass == "Warrior") {
      character = new Warrior(name)
    }
    if (myClass == "Ranger") {
      character = new Ranger(name)
    }
    character.team = team
    character
  }
}
