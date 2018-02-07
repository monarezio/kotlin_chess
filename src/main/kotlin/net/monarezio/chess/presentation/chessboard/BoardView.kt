package net.monarezio.chess.presentation.chessboard

import net.monarezio.chess.presentation.chessboard.custom.ChessboardView
import tornadofx.*

class BoardView : View("Chessboard") {

    val controller: BoardController by inject()

    val chessboard = ChessboardView(controller.getFields())

    init {
        chessboard.onClickListener = controller
    }

    override val root = pane {
        add(chessboard)
    }
}
