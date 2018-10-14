package abstractfactory.factory

abstract class Item(
    caption: String
) {
    abstract fun makeHTML(): String
}
