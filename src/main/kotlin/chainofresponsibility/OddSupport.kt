package chainofresponsibility

class OddSupport(
    name: String
) : Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.getNumber() % 2 == 1
    }
}
