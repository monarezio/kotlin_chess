package net.monarezio.chess.presentation.chessboard

import net.monarezio.chess.domain.chess.Chessboard
import net.monarezio.chess.domain.chess.models.Figure
import net.monarezio.chess.domain.chess.models.FigureType
import tornadofx.*

class ChessboardController: Controller() {

    private val chessboard = Chessboard()

    fun getFigure(x: Int, y: Int): Char {
        val figure = chessboard.fields[x][y]

        return if(figure is Figure) {
            val tmp = when(figure.figureType) {
                FigureType.BISHOP -> '♗'
                FigureType.ROOK -> '♖'
                FigureType.QUEEN -> '♕'
                FigureType.PAWN -> '♙'
                FigureType.KING -> '♔'
                FigureType.KNIGHT -> '♘'
            }

            if(figure.isBlack) tmp + 6
            else tmp

        } else ' '
    }

}