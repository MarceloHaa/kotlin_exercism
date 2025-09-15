class Dna(val sequence: String) {

    init {
        require(isValidSequence()) { "Sequencia invalida de Dna" }
    }

    private fun isValidSequence(): Boolean {
        return sequence.all { it in "ACGT" }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val counts = mutableMapOf(
                'A' to 0,
                'C' to 0,
                'G' to 0,
                'T' to 0
            )
            
            sequence.forEach { nucleotide ->
                counts[nucleotide] = counts.getOrDefault(nucleotide, 0) + 1
            }
            
            return counts
        }
}
