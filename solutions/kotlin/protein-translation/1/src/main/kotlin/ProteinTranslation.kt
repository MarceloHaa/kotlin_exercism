fun translate(rna: String?): List<String> {
   if(rna == null || rna.isEmpty())return emptyList()

   val proteinMap = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine", "UUC" to "Phenylalanine",
        "UUA" to "Leucine", "UUG" to "Leucine",
        "UCU" to "Serine", "UCC" to "Serine", "UCA" to "Serine", "UCG" to "Serine",
        "UAU" to "Tyrosine", "UAC" to "Tyrosine",
        "UGU" to "Cysteine", "UGC" to "Cysteine",
        "UGG" to "Tryptophan",
        "UAA" to "STOP", "UAG" to "STOP", "UGA" to "STOP" 
   )
    val proteins = mutableListOf<String>()
    var foundStopCodon = false
    
    for (i in 0 until rna.length step 3) {
         if (i + 3 > rna.length){
            if (!foundStopCodon) {
                throw IllegalArgumentException("Invalid codon")
            }
            break
         } 
         
         val codon = rna.substring(i, i + 3)
        val aminoAcid = proteinMap[codon]
        
        if (aminoAcid == null) {
            throw IllegalArgumentException("Códon inválido: $codon")
        }
        if (aminoAcid =="STOP"){
            foundStopCodon = true
            break
        }
        proteins.add(aminoAcid)
    }
     return proteins
}
