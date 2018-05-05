package com.main

import com.`trait`.{BasicIntQueue, Doubling, Increment}

object Main {
    def main(args: Array[String]): Unit = {
        val queue = new BasicIntQueue with Increment with Doubling
        queue.put(10)
        println(queue.getBuffer)
        queue.put(20)
        println(queue.getBuffer)
        //queue.put(-100)
        //println(queue.getBuffer)
        queue.get
        println(queue.getBuffer)
        queue.get
        println(queue.getBuffer)
        //queue.get
        //println(queue.getBuffer)
    }
}
