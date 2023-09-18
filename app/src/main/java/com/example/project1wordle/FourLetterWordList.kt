package com.example.project1wordle

class FourLetterWordList
{



    companion object {
        fun getRandomFourLetterWord(): Any {
            var FourLW=  ""
            var FourLetterWordList = listOf("doup", "star", "meme", "kine", "care", "road")
            for (i in 1..4) {
                val rnds = (0..5).random()
                FourLW= FourLetterWordList.get(rnds)

            }
            return FourLW
        }
    }

}