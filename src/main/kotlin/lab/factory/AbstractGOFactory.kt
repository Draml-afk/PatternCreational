package lab

open abstract class AbstractGOFactory {
    abstract fun createPoint() : Point

    abstract fun createCircle() : Circle
}