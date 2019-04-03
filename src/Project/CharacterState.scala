package Project

trait CharacterState{
def spawn(loc: Location)
}
class dead(character: Character) extends CharacterState{
  override def spawn(loc: Location): Unit = {
    character.location = loc
    character.state = new alive(character)
  }
}
class alive(character: Character) extends CharacterState{
  override def spawn(loc: Location): Unit = {

  }
}
