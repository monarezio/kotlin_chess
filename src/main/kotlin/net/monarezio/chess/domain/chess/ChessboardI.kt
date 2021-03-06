package net.monarezio.chess.domain.chess

import net.monarezio.chess.domain.chess.models.Coordinate
import net.monarezio.chess.domain.chess.models.figures.Figure

interface ChessboardI {

    fun getNextMoves(x: Int, y: Int): List<Coordinate>

    fun getField(x: Int, y: Int): Figure?

    fun getFields(): List<List<Figure?>>

}