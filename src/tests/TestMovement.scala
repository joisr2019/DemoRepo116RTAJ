package tests
import Project.{Character, Game, Ranger, Warrior, Wizard}
import org.scalatest.FunSuite
class TestMovement extends  FunSuite {
  test("Test Movement") {
    val example1: Character = new Warrior("Bob")
    val example2: Character = new Ranger("Kevin")
    val example3: Character = new Wizard("Chen")
    val example4: Character = new Warrior("Bob")
    example1.Move("W")
    example2.Move("A")
    example3.Move("S")
    example4.Move("D")
    assert(example1.location.x == 0)
    assert(example1.location.y == -1)
    assert(example2.location.x == -1)
    assert(example2.location.y == 0)
    assert(example3.location.x == 0)
    assert(example3.location.y == 1)
    assert(example4.location.x == 1)
    assert(example4.location.y == 0)
  }
}
