package interpreter

import java.util.StringTokenizer

class Context(
    text: String
) {

    private val tokenizer = StringTokenizer(text)
    private var currentToken = ""

    init {
        nextToken()
    }

    fun nextToken(): String {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken()
        } else {
            currentToken = ""
        }
        return currentToken
    }

    fun currentToken(): String {
        return currentToken
    }

    fun skipToken(token: String) {
        if (token != currentToken) {
            throw ParseException("Warning $token is expected. but $currentToken is found.")
        }
        nextToken()
    }

    fun currentNumber(): Int {
        return Integer.parseInt(currentToken)
    }
}
