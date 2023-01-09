package lab.factory

abstract class GraphObjet : Cloneable {

    companion object {
        const val DEFAULT_COLOR = "black"
    }

    abstract fun draw()

}