object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Only positive integers" }
        
        var steps = 0
        var current = start
        
        while (current != 1) {
            current = if (current % 2 == 0) {
                current / 2
            } else {
                current * 3 + 1
            }
            steps++
        }
        
        return steps
    }
}