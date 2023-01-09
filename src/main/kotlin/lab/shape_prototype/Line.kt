package lab.shape

import lab.factory.GraphObjet

class Line( var x: Int = 0, private var y: Int = 0, color: String = DEFAULT_COLOR) : GraphObjet() {


    public override fun clone(): Line {
        return super.clone() as Line
    }

    override fun draw() {
        println("Line: ($x, $y) $color")
    }

    override fun toString(): String {
        return "$x $y $color"
    }
}