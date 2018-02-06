package net.monarezio.chess.domain.chess.models

data class Figure private constructor(val figureType: FigureType, val isBlack: Boolean) {

    companion object {
        fun createBlack(figureType: FigureType) = Figure(figureType, true)

        fun createWhite(figureType: FigureType) = Figure(figureType, false)
    }
}