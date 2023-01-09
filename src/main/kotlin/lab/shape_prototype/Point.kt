package lab.shape

import lab.Cords
import lab.factory.GraphObjet

open class Point(private var x: Int = 0, private var y: Int = 0, color: String = DEFAULT_COLOR) : GraphObjet() {
    private val cords: Cords = Cords(x, y)


    public override fun clone(): Point {
        return super.clone() as Point
    }

    override fun draw() {
        println("Point: ($x, $y) $color")
    }
}