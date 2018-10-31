package proxy

class Printer : Printable {

    private var name: String = ""

    constructor() {
        heavyJob("Printerのインスタンス生成中")

    }

    constructor(name: String) {
        this.name = name
        heavyJob("Printerのインスタンス($name)生成中")
    }

    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        System.out.print(msg)
        for (i in 0 until 5) {
            Thread.sleep(1000)
            System.out.print(".")
        }
        System.out.println("完了。")
    }


}
