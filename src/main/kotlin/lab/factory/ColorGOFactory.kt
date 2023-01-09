package lab

open class ColorGOFactory : AbstractGOFactory() {

    val DEFAULT_POINT = Point()


    override fun createPoint(): Point {
        val p = DEFAULT_POINT.clone()
        Scene.instance.add(p)
        return p
    }

    override fun createCircle(): Circle {
        val c = Circle(0, 0, 1)
        Scene.instance.add(c)
        return c
    }
}




