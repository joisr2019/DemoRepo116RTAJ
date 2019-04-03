package tests

import Project.{Character, Game, Ranger, Warrior, Wizard}
import org.scalatest.FunSuite

class TestDamage extends FunSuite {
  test("Test Damage") {
    val pin: String = "Pin"
    val fireball: String = "Fireball"
    val smite: String = "Smite"
    val example1: Character = new Warrior("Bob")
    val example2: Character = new Ranger("Kevin")
    val example3: Character = new Wizard("Chen")
    val example4: Character = new Warrior("Bob")
    val example5: Character = new Ranger("Kevin")
    val example6: Character = new Wizard("Chen")
    val example7: Character = new Warrior("Bob")
    val example8: Character = new Ranger("Kevin")
    val example9: Character = new Wizard("Chen")
    example1.Damage(smite)
    example2.Damage(smite)
    example3.Damage(smite)
    example4.Damage(pin)
    example5.Damage(pin)
    example6.Damage(pin)
    example7.Damage(fireball)
    example8.Damage(fireball)
    example9.Damage(fireball)
    assert(example1.HP == 230)
    assert(example4.HP == 220)
    assert(example7.HP == 210)
    assert(example2.HP == 150)
    assert(example5.HP == 140)
    assert(example8.HP == 130)
    assert(example3.HP == 130)
    assert(example6.HP == 120)
    assert(example9.HP == 110)
  }
}
