package lab


class Scene private constructor() {
    private val objects: MutableList<GraphObjet>

    init {
        objects = ArrayList<GraphObjet>()
    }

    fun add(o: GraphObjet) {
        objects.add(o)
    }

    fun clear() {
        objects.clear()
    }

    fun draw() {
        for (g in objects) g.draw()
    }

    companion object {
        val instance = Scene()
    }
}
