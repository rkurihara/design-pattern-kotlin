package facade.pagemaker

import java.io.FileWriter

class PageMaker private constructor() {

    companion object {
        fun makeWelcomePage(mailaddr: String, filename: String) {
            val mailprop = Database.getProperties("maildata")
            val username = mailprop.getProperty(mailaddr)
            val writer = HtmlWriter(FileWriter(filename))
            writer.title("Welcome to $username's page")
            writer.paragraph("$username のページへようこそ。")
            writer.paragraph("メール待っていますね。")
            writer.mailto(mailaddr, username)
            writer.close()
            println("$filename is created for $mailaddr ($username)")
        }
    }
}
