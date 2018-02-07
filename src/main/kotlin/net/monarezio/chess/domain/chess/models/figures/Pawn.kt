package net.monarezio.chess.domain.chess.models.figures

import net.monarezio.chess.domain.chess.models.actions.Attack
import net.monarezio.chess.domain.chess.models.actions.Move

data class Pawn(override val black: Boolean) : Figure(black) {

    override val moves: List<Move> = listOf(Move.FORWARD)

    override val attack: Attack = Attack.DIAGONAL

    override val maxDistance: Int
        get() = if(didMove) 1 else 2


    override val value: Int = 1
}