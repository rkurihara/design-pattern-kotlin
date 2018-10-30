package state

import java.awt.BorderLayout
import java.awt.Button
import java.awt.Color
import java.awt.Frame
import java.awt.Panel
import java.awt.TextArea
import java.awt.TextField
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class SafeFrame(
    title: String
) : Frame(title), ActionListener, Context {

    private val textClock = TextField(60)
    private val textScreen = TextArea(10, 60)
    private val buttonUse = Button("金庫使用")
    private val buttonAlerm = Button("非常ベル")
    private val buttonPhone = Button("通常電話")
    private val buttonExit = Button("終了")

    private var state: State = DayState

    init {
        background = Color.LIGHT_GRAY
        layout = BorderLayout()

        add(textClock, BorderLayout.NORTH)
        textClock.isEditable = false

        add(textScreen, BorderLayout.CENTER)
        textScreen.isEditable = false

        val panel = Panel()
        panel.add(buttonUse)
        panel.add(buttonAlerm)
        panel.add(buttonPhone)
        panel.add(buttonExit)

        add(panel, BorderLayout.SOUTH)

        pack()
        isVisible = true

        buttonUse.addActionListener(this)
        buttonAlerm.addActionListener(this)
        buttonPhone.addActionListener(this)
        buttonExit.addActionListener(this)
    }

    override fun actionPerformed(e: ActionEvent) {
        println(e.toString())
        if (e.source == buttonUse) {
            state.doUse(this)
        } else if (e.source == buttonAlerm) {
            state.doAlerm(this)
        } else if (e.source == buttonPhone) {
            state.doPhone(this)
        } else if (e.source == buttonExit) {
            System.exit(0)
        } else {
            println("?")
        }
    }

    override fun setClock(hour: Int) {
        var clockString = "現在の時刻は"
        if (hour < 10) {
            clockString += "0$hour:00"
        } else {
            clockString += "$hour:00"
        }
        println(clockString)
        textClock.text = clockString
        state.doClock(this, hour)
    }

    override fun changeState(state: State) {
        println("${this.state}から$state へ状態が変化しました。")
        this.state = state
    }

    override fun callSecurityCenter(msg: String) {
        textScreen.append("call! $msg \n")
    }

    override fun recordLog(msg: String) {
        textScreen.append("record... $msg \n")
    }
}
