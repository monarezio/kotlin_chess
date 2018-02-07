package net.monarezio.chess.presentation.chessboard

import net.monarezio.chess.domain.chess.Chessboard
import net.monarezio.chess.domain.chess.ChessboardI
import net.monarezio.chess.domain.chess.models.figures.*
import tornadofx.*

class ChessboardController: Controller() {

    private val chessboard: ChessboardI = Chessboard()

    fun getFigure(x: Int, y: Int): Char {
        val figure = chessboard.getField(x, y)


        val tmp = when(figure) {
                is Bishop -> '♗'
                is Rook -> '♖'
                is Queen -> '♕'
                is Pawn -> '♙'
                is King -> '♔'
                is Knight -> '♘'
                else -> ' '
        }

        return if(figure is Figure && figure.black) tmp + 6 else tmp
    }

}