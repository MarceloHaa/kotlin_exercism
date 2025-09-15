import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number in 1..64) { "Square number must be between 1 and 64" }        
       
        return BigInteger.valueOf(2).pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {       
        return BigInteger.valueOf(2).pow(64) - BigInteger.ONE
    }
}