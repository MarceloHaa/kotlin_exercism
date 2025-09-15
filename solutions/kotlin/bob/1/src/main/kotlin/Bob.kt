object Bob {
    fun hey(input: String): String {
       val resp = input.trim()
       if(resp.isEmpty()){
           return "Fine. Be that way!"
       }
       val isQuestion = resp.endsWith('?')
       val isYELL= resp.any{it.isLetter() } &&
                   resp.none{it.isLetter() && it.isLowerCase()}

                   return when{
                       isYELL && isQuestion -> "Calm down, I know what I'm doing!"
                       isYELL-> "Whoa, chill out!"
                       isQuestion -> "Sure."
                       else -> "Whatever."
                   }
    }
}
