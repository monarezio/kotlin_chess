package net.monarezio.chess.domain.chess.models.figures

import net.monarezio.chess.domain.chess.models.actions.Attack
import net.monarezio.chess.domain.chess.models.actions.Move

abstract class Figure constructor(black: Boolean) {

    var didMove: Boolean = false

    abstract val black: Boolean

    abstract val moves: List<Move>

    abstract val attack: Attack

    abstract val maxDistance: Int

    abstract val value: Int
}

