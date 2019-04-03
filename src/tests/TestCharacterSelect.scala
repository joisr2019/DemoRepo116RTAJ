package tests

import Project.{Character, Game, Ranger, Warrior, Wizard}
import org.scalatest.FunSuite

class TestCharacterSelect extends FunSuite {
  test("Test Character Select") {
    val name1: String = "Bob"
    val name2: String = "Kevin"
    val name3: String = "Tyrone"
    val name4: String = "Chen"
    val warrior: String = "Warrior"
    val wizard: String = "Wizard"
    val ranger: String = "Ranger"
    val example1: Character = new Warrior(name3)
    val example2: Character = new Ranger(name2)
    val example3: Character = new Wizard(name1)
    assert(Game.CharacterSelect(name1, warrior, "red").HP == example1.HP)
    assert(Game.CharacterSelect(name1, warrior, "red").HP == 250)
    assert(Game.CharacterSelect(name2, wizard, "red").HP == example3.HP)
    assert(Game.CharacterSelect(name2, wizard,"green").HP == 150)
    assert(Game.CharacterSelect(name3, ranger, "green").HP == example2.HP)
    assert(Game.CharacterSelect(name3, ranger, "green").HP == 170)
    assert(Game.CharacterSelect(name1, warrior,"blue").name1 == "Bob")
    assert(Game.CharacterSelect(name2, ranger, "blue").name1 == "Kevin")
    assert(Game.CharacterSelect(name3, ranger,"yellow").name1 == "Tyrone")
    assert(Game.CharacterSelect(name4, ranger,"yellow").name1 == "Chen")
  }
}
