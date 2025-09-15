object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
      if(factors.isEmpty() || limit <= 1) return 0

        val multiples = mutableSetOf<Int>()
        for (factor in factors) {
            if (factor == 0) continue

            var multiple = factor
            while(multiple < limit){
                multiples.add(multiple)
                multiple += factor
            }
        }
        return multiples.sum()
    }
}
