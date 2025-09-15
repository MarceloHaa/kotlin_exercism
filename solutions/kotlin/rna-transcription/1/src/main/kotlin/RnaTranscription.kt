fun transcribeToRna(dna: String): String {
    val transcriptionMap = mapOf(
        'G' to 'C',
        'C' to 'G',
        'T' to 'A',
        'A' to 'U'
    )
    
    return dna.map { nucleotide ->
        transcriptionMap[nucleotide] ?: throw IllegalArgumentException("Nucleotídeo inválido: $nucleotide")
    }.joinToString("")
}
