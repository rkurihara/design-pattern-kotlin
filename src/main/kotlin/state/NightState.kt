package state

object NightState : State {
    override fun doClock(context: Context, hour: Int) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState)
        }
    }

    override fun doUse(context: Context) {
        context.callSecurityCenter("非常:夜間の金庫使用!")
    }

    override fun doAlerm(context: Context) {
        context.callSecurityCenter("非常ベル(夜間)")
    }

    override fun doPhone(context: Context) {
        context.recordLog("夜間の通話録音")
    }

    override fun toString(): String {
        return "[夜間]"
    }
}
