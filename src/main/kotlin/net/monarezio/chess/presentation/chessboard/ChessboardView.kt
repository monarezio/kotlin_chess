package net.monarezio.chess.presentation.chessboard

import javafx.scene.layout.BorderStrokeStyle
import tornadofx.*

class ChessboardView : View("Chessboard") {

    val controller: ChessboardController by inject()

    override val root = pane {
        hbox {
            style {
                borderColor += box(c("#000000"))
                borderStyle += BorderStrokeStyle.SOLID
                borderWidth += box(0.5.px)
            }

            for(i in 0..7) {
                vbox {
                    for(j in 0..7) {
                        pane {

                            label {
                                text = controller.getFigure(i,j).toString()

                                style {
                                    fontSize = 52.px
                                }
                            }

                            style {

                                minWidth = 64.px
                                minHeight = 64.px

                                if((i+j) % 2 == 1)
                                    backgroundColor += c("#bdc3c7")
                                else
                                    backgroundColor += c("#ecf0f1")
                            }
                        }
                    }
                }
            }
        }
    }
}
