package com.list

class List {

    /**
      * 折叠
      */
    def fold(): Unit = {
        //println(("a" /: "bcdef")(_ +" * "+  _))
        println((List("a", "b", "c") :\ "e")(_ + "x" + _))
    }
}
