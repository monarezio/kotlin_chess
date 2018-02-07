package net.monarezio.chess.domain.chess

import net.monarezio.chess.domain.chess.models.Coordinate
import net.monarezio.chess.domain.chess.models.figures.*

class Chessboard: ChessboardI {

    var fields: Array<Array<Figure?>> = arrayOfNulls<Unit>(8)
            .map { arrayOfNulls<Figure?>(8) }
            .toTypedArray()

    init {
        fields[0][0] = Rook(true)
        fields[7][0] = Rook(true)
        fields[1][0] = Knight(true)
        fields[6][0] = Knight(true)
        fields[2][0] = Knight(true)
        fields[5][0] = Bishop(true)
        fields[3][0] = Bishop(true)
        fields[4][0] = King(true)
        for(i in 0..7) {
            fields[i][1] = Pawn(true)
        }

        fields[0][7] = Rook(false)
        fields[7][7] = Rook(false)
        fields[1][7] = Knight(false)
        fields[6][7] = Knight(false)
        fields[2][7] = Bishop(false)
        fields[5][7] = Bishop(false)
        fields[3][7] = Queen(false)
        fields[4][7] = King(false)
        for(i in 0..7) {
            fields[i][6] = Pawn(false)
        }
    }

    override fun getNextMoves(x: Int, y: Int): List<Coordinate> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getField(x: Int, y: Int): Figure? = fields[x][y]

}