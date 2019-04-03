package tests
import Project.{Character, Game, Ranger, Warrior, Wizard, Potion, Location}
import org.scalatest.FunSuite
class TestPotion extends FunSuite {
  test("Test Potion") {
    val example1: Character = new Warrior("Bob")
    val example2: Character = new Ranger("Kevin")
    val example3: Character = new Wizard("Chen")
    val location: Location = new Location(0, 0)
    val failLocation: Location = new Location(8, 8)
    val potion: Potion = new Potion(location)
    example1.HP = 100
    example1.pickUpPotion(potion)
    assert(example1.HP == 150)
    example2.HP = 20
    example2.location = failLocation
    example2.pickUpPotion(potion)
    assert(example2.HP == 20)
    example3.HP = 150
    example3.pickUpPotion(potion)
    assert(example3.HP == 150)
  }
}
