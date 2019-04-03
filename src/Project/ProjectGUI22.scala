package Project

import Project.ProjectGUI.{blueRectangle, greenRectangle, keyPressed, redRectangle, view, yellowRectangle}
import javafx.scene.input.{KeyEvent, MouseEvent}
import scalafx.animation.AnimationTimer
import scalafx.application.{JFXApp, Platform}
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.control.{Button, ContextMenu, TextInputDialog}
import scalafx.event.ActionEvent
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.layout.{GridPane, HBox, VBox}
import scalafx.scene.paint.Color._
import scalafx.scene.shape.{Box, Circle, Rectangle, Shape}
import scalafx.scene.{Group, Scene}
import scalafx.Includes._
import scalafx.scene.effect.DropShadow
import scalafx.scene.input.KeyCode
import scalafx.scene.text.Text
import scalafx.stage.{Stage, Window}

object ProjectGUI22 extends JFXApp {

  //  val player1Sprite: Image = new Image("reupdatedsprites/BlueWarriorNoSword.png")
  //playerSprite(game.player1.location.x, game.player1.location.z, Color.Blue)

  //  val game = new Game()
  val scene1: Scene = new Scene
  val scene2: Scene = new Scene
  val scene3: Scene = new Scene
  var character: Character = null

//  def characterRender(char: Character): Rectangle = {
//    if (char.profession == "Warrior") new Rectangle(){
//      height = 50
//      width = 50
//      fill = Red
//    }
//    if (char.profession == "Wizard") new Rectangle(){
//      height = 50
//      width = 50
//      fill = Blue
//    }
//    if (char.profession == "Ranger") new Rectangle(){
//      height = 50
//      width = 50
//      fill = Green
//    }
//    else null
//  }


  val window = new PrimaryStage

  var sceneGraphics: Group = new Group {}

  val buttonStartGame = new Button {
    text = "Start Game"
    tooltip = "Click me to close without saving your changes."
    scene1
  }
  val dialog = new TextInputDialog {
    initOwner(stage)
    title = "What's Your Name?"
  }
  val result = dialog.showAndWait()

  result match {
    case Some(name) => character = Game.CharacterSelect(name, "Warrior", "Red")
    val name1: String = name
    case None => println("Dialog was canceled.")
  }
  //val namee = name1

  val yellowRectangle = new Rectangle() {
    width = 60
    height = 40
    //    x = 940
    //    y = 760
    fill = Yellow
  }
  val blueRectangle = new Rectangle() {
    width = 60
    height = 40
    fill = Blue
  }
  val greenRectangle = new Rectangle() {
    width = 60
    height = 40
    fill = Green
  }
  val redRectangle = new Rectangle() {
    width = 60
    height = 40
    fill = Red
  }

  var player: Image = new Image("reupdatedsprites/"  + "BlueWarriorNoSword" + ".png")
  var view = new ImageView(player)
  var view2 = new ImageView(player)


  this.stage = new PrimaryStage {
    this.title = "JART"
    scene = new Scene(1000, 800) {
      fill = LightGray
      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))
//      addEventHandler(MouseEvent.MOUSE_CLICKED, (event: MouseEvent) => view2 = new ImageView("reupdatedsprites/" + "BlueWarrior" + ".png"))
//      addEventHandler(MouseEvent.MOUSE_RELEASED, (event: MouseEvent) => )

      content = new HBox {
        padding = Insets(20)
        children = Seq(
          new Text {
            text = "    Welcome to JART " +  ". Please Select A Class To Continue"
            style = "-fx-font-size: 28pt"

            fill = DarkBlue
            effect = new DropShadow {
              color = DarkBlue
              radius = 25
              spread = 0.25
            }
          },
          new Button("Warrior") {
            translateY = 300
            scaleX = 3
            translateX = -600
            scaleY = 3
            onAction = (event1: ActionEvent) => {
              scene_=(new Scene(1000, 800) {
                fill = LightGray
                content = List(
                  new VBox() {
                    spacing = 130
                    children =
                      List(yellowRectangle, redRectangle, greenRectangle, view, blueRectangle)
                  }
                )
                }
              )
            }
          },new Button("Wizard") {
            translateY = 300
            scaleX = 3
            translateX = -450
            scaleY = 3
            onAction = (event1: ActionEvent) => {
              player= new Image("reupdatedsprites/"  + "BlueWizard" + ".png")
              view = new ImageView(player)
              view = new ImageView(player)
              scene_=(new Scene(1000, 800) {
                fill = LightGray
                content = List(
                  new VBox() {
                    spacing = 130
                    children =
                      List(yellowRectangle, redRectangle, greenRectangle, view, blueRectangle)
                  }
                )
              }
              )
            }
          },new Button(text = "Ranger") {
            translateY = 300
            scaleX = 3
            translateX = -300
            scaleY = 3
            onAction = (event1: ActionEvent) => {
              player = new Image("reupdatedsprites/"  + "BlueArcher" + ".png")
              view = new ImageView(player)
                scene_= (new Scene(1000, 800) {
                fill = LightGray
                content = List(
                  new VBox() {
                    spacing = 130
                    children =
                      List(yellowRectangle, redRectangle, greenRectangle, view, blueRectangle)
                  }
                )
              }
              )
            }
          }
        )
      }
    }
  }



  def keyPressed(keyCode: KeyCode): Unit = {
    keyCode.getName match {
      case "W" => view.translateY.value -= 5
      case "A" => view.translateX.value -= 5
      case "S" => view.translateY.value += 5
      case "D" => view.translateX.value += 5
      case _ =>

    }
  }

 // this.stage = game
}
//END OF FIRST SCENE
//
//  //THIS IS THE SECOND SCENE
//  this.stage = new PrimaryStage {
//    this.title = "JART"
//    width = 1000
//    height = 800
//    scene = new Scene {
//      fill = LightGray
//      children = new GridPane
//      //ASK FOR USER INPUT FOR CLASSES
//    }
//  }
//    //END OF SECOND SCENE
//
//  //THIS IS THE THIRD SCENE
//  this.stage = new PrimaryStage {
//    this.title = "JART"
//    width = 1000
//    height = 800
//    scene = new Scene {
//      fill = LightGray
//      //ASK FOR USER INPUT FOR COLORS
//    }
//  }
//  //END OF THIRD SCENE


  //THIS IS THE FOURTH SCENE
 // val player: Image =

//  val yellowRectangle = new Rectangle() {
//    width = 60
//    height = 40
////    x = 940
////    y = 760
//    fill = Yellow
//  }
//  val blueRectangle = new Rectangle() {
//    width = 60
//    height = 40
//    fill = Blue
//  }
//  val greenRectangle = new Rectangle() {
//    width = 60
//    height = 40
//    fill = Green
//  }
//  val redRectangle = new Rectangle() {
//    width = 60
//    height = 40
//    fill = Red
//  }

//  this.stage = new PrimaryStage {
//    this.title = "JART"
//    width = 1000
//    height = 800
//    scene = new Scene {
//      fill = LightGray
//      content = List(
//        new VBox(){
//          spacing = 200
//          children = List(yellowRectangle, redRectangle, greenRectangle, blueRectangle)
//        }
//      )
     // addEventHandler(MouseEvent.MOUSE_CLICKED, (event: MouseEvent) => Damage()


      //PLAY THE GAME

  //END OF FOURTH SCENE



//input name

//      Seq(
//        at(0 s) {Circle.centerX -> random * 800},
//        at(0 s) {circle.centerY -> random * 600},
//        at(40 s) {circle.centerX -> random * 800},
//        at(40 s) {circle.centerY -> random * 600}
//      )
//      ContextMenu (
//        "Start Game"
//        , "End Game"
//      )
//        add(buttonStartGame, 400, 400, 40, 40),
//        add(buttonEndGame, 500, 500, 50, 50)
//      }
//      content = new HBox {
//        children = Seq{
//        new Rectangle {
//        fill = Yellow
//        x = 0
//          y=0
//        width = 50
//        height = 50
//      }; new Rectangle {
//        fill = Green
//        x = 400
//        y = 200
//        width = 50
//        height = 50
      //      new Circle {
      //      fill = Blue
      //      }
//      List(
//        new GridPane {
//          add(buttonStartGame, 400, 400, 40, 40)
//          add(buttonEndGame, 500, 500, 50, 50)
//        }
        //        buttonStartGame.onAction = (event: ActionEvent) => {
        //        scene1()


//      new GridPane {
//        add(new buttonStartGame(game), 1, 4)
//      }

    //SCENE 2

//      addEventHandler(KeyEvent.ANY, new WASDInputs(game.player1))


  //WHEN NEED TO GET POINTS
//scene = new Scene {
//      fill = LightGreen
//      content = new Circle {
//        x = 25
//        y = 40
//        width = 100
//        height = 100
//        fill <== when (hover) choose Green otherwise Red
//      }
