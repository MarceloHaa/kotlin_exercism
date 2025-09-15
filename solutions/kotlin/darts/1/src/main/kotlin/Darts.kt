object Darts {

    fun score(x: Number, y: Number): Int {
        val xDouble = x.toDouble()
        val yDouble = y.toDouble()
        val distance = Math.sqrt(xDouble * xDouble + yDouble * yDouble)
        
        return when {
            distance <= 1.0 -> 10
            distance <= 5.0 -> 5
            distance <= 10.0 -> 1
            else -> 0
        }
    }
}