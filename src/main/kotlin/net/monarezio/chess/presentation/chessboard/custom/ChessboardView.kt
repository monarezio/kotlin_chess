package net.monarezio.chess.presentation.chessboard.custom

import javafx.geometry.Pos
import javafx.scene.layout.BorderStrokeStyle
import tornadofx.*

class ChessboardView(fields: List<List<Char>>) : View() {

    override val root = pane {}

    var onClickListener: OnClickListener? = null

    var fields: List<List<Char>> = fields
        set(value) { render() }

    init { render() }

    private fun render() {

        root.children.removeAll() //Remove every child

        root.add(hbox {
            style {
                borderColor += box(c("#000000"))
                borderStyle += BorderStrokeStyle.SOLID
                borderWidth += box(0.5.px)
            }

            for(i in 0..7) {
                vbox {
                    for(j in 0..7) {
                        label {
                            text = fields[i][j].toString()

                            alignment = Pos.CENTER

                            style {

                                fontSize = 52.px

                                minWidth = 64.px
                                minHeight = 64.px

                                if((i+j) % 2 == 1)
                                    backgroundColor += c("#bdc3c7")
                                else
                                    backgroundColor += c("#ecf0f1")
                            }

                            setOnMousePressed { onClickListener?.onClick(i, j) }
                        }
                    }
                }
            }
        })
    }
}