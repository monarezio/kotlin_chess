package net.monarezio.chess

import javafx.application.Application
import javafx.scene.text.Font
import javafx.stage.Stage
import net.monarezio.chess.presentation.chessboard.ChessboardView
import tornadofx.*

/**
 * Created by monarezio on 06/05/2017.
 */
class Run: App(ChessboardView::class) {

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