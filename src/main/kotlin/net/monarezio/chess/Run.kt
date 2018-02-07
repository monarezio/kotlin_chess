package net.monarezio.chess

import javafx.application.Application
import javafx.stage.Stage
import net.monarezio.chess.presentation.chessboard.BoardView
import tornadofx.*

/**
 * Created by monarezio on 06/05/2017.
 */
class Run: App(BoardView::class) {

    override fun start(stage: Stage) {
        super.start(stage)
        stage.isResizable = false
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Run::class.java, *args)
        }
    }
}