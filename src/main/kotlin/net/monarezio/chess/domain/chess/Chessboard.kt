package net.monarezio.chess.domain.chess

import net.monarezio.chess.domain.chess.models.Coordinate
import net.monarezio.chess.domain.chess.models.Figure
import net.monarezio.chess.domain.chess.models.FigureType

class Chessboard: ChessboardI {

    var fields: Array<Array<Figure?>> = arrayOfNulls<Unit>(8)
            .map { arrayOfNulls<Figure?>(8) }
            .toTypedArray()

    init {
        fields[0][0] = Figure.createBlack(FigureType.ROOK)
        fields[7][0] = Figure.createBlack(FigureType.ROOK)
        fields[1][0] = Figure.createBlack(FigureType.KNIGHT)
        fields[6][0] = Figure.createBlack(FigureType.KNIGHT)
        fields[2][0] = Figure.createBlack(FigureType.BISHOP)
        fields[5][0] = Figure.createBlack(FigureType.BISHOP)
        fields[3][0] = Figure.createBlack(FigureType.QUEEN)
        fields[4][0] = Figure.createBlack(FigureType.KING)
        for(i in 0..7) {
            fields[i][1] = Figure.createBlack(FigureType.PAWN)
        }

        fields[0][7] = Figure.createWhite(FigureType.ROOK)
        fields[7][7] = Figure.createWhite(FigureType.ROOK)
        fields[1][7] = Figure.createWhite(FigureType.KNIGHT)
        fields[6][7] = Figure.createWhite(FigureType.KNIGHT)
        fields[2][7] = Figure.createWhite(FigureType.BISHOP)
        fields[5][7] = Figure.createWhite(FigureType.BISHOP)
        fields[3][7] = Figure.createWhite(FigureType.QUEEN)
        fields[4][7] = Figure.createWhite(FigureType.KING)
        for(i in 0..7) {
            fields[i][6] = Figure.createWhite(FigureType.PAWN)
        }
    }

    override fun getNextMoves(x: Int, y: Int): List<Coordinate> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getField(x: Int, y: Int): Figure? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}