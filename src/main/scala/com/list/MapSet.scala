package com.list

class MapSet {
    def longestWrod(string: String) = {
        val words = string.split(" ")
        var word = words(0)
        var ids = 0
        for (i <- 1 until word.length) {
            if (words(i).length > word.length) {
                word = words(i)
                ids = i
            }
        }
        (ids, word)
    }
}
