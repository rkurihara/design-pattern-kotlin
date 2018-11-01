package command.drawer

import command.command.MacroCommand
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

class DrawCanvas(
    width: Int,
    height: Int,
    private val history: MacroCommand
) : Canvas(), Drawable {

    init {
        setSize(width, height)
        background = Color.white
    }

    private val color = Color.red
    private val radius: Int = 6

    override fun paint(g: Graphics) {
        history.execute()
    }


    override fun draw(x: Int, y: Int) {
        val g = graphics
        g.color = color
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2)
    }
}
