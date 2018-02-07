package net.monarezio.chess.domain.chess.models.figures

import net.monarezio.chess.domain.chess.models.actions.Attack
import net.monarezio.chess.domain.chess.models.actions.Move

data class King(override val black: Boolean) : Figure(black) {

    override val moves: List<Move> = listOf(Move.DIAGONAL, Move.STRAIGHT)

    override val attack: Attack = Attack.MOVING

    override val maxDistance: Int = 1

    override val value: Int = 0
}