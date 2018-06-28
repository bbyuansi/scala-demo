package com.file

import java.io.{File, PrintWriter}
import java.util.Date

object FilePrinter {
    def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
        val writer = new PrintWriter(file)
        try {
            op(writer)
        } finally {
            writer.close()
        }
    }

    def printWriter(): Unit = {
        withPrintWriter(new File("./hehe")) {
            writer => writer.println(new Date)
        }
    }
}
