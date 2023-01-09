package lab.shape

import lab.Cords
import lab.factory.GraphObjet

class Circle(
    private var x: Int = 0,
    private var y: Int = 0,
    private var r: Int = 0,
) : GraphObjet() {

    private val center : Cords = Cords(x, y)

    public override fun clone(): Circle {
        return super.clone() as Circle
    }

    override fun draw() {
        println("Circle: ($x, $y) R-$r $color")
    }
}