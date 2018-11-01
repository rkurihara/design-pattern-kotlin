package command

import command.command.MacroCommand
import command.drawer.DrawCanvas
import command.drawer.DrawCommand
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame

class Main(
    title: String
) : JFrame(title), ActionListener, MouseMotionListener, WindowListener {

    private val history = MacroCommand()
    private val canvas = DrawCanvas(400, 400, history)
    private val clearButton = JButton("clear")

    init {
        this.addWindowListener(this)
        canvas.addMouseMotionListener(this)
        clearButton.addActionListener(this)

        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(clearButton)
        val mainBox = Box(BoxLayout.X_AXIS)
        mainBox.add(buttonBox)
        mainBox.add(canvas)
        contentPane.add(mainBox)

        pack()
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent) {
        if (e.source == clearButton) {
            history.clear()
            canvas.repaint()
        }
    }

    override fun mouseMoved(e: MouseEvent) {
        // NTD
    }

    override fun mouseDragged(e: MouseEvent) {
        val cmd = DrawCommand(canvas, e.point)
        history.append(cmd)
        cmd.execute()
    }

    override fun windowDeiconified(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun windowClosing(e: WindowEvent?) {
        System.exit(0)
    }

    override fun windowClosed(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun windowActivated(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun windowDeactivated(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun windowOpened(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun windowIconified(e: WindowEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

