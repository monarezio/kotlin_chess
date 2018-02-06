package net.monarezio.chess.domain.chess

import net.monarezio.chess.domain.chess.models.Figure
import net.monarezio.chess.domain.chess.models.FigureType

class Chessboard {

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
    }

}