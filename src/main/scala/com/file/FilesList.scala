package com.file

import java.io.File
import scala.io.Source

class FilesList {

    /**
      * 遍历当前目录文件
      */
    def fileList() {
        val filesList = new File(".").listFiles
        filesList.foreach(println)
    }

    def fileListEndWithString(end: String): Unit = {
        val filesList = new File("D:\\code\\phpStudy2018\\PHPTutorial\\WWW\\phpRedisAdmin").listFiles
        for {file <- filesList
             if file.getName.endsWith(end)
             line <- fileLines(file)
             trimmed = line.trim
             if trimmed.matches(".*redis.*")
        } {
            println(line)
        }
    }

    def fileLines(file: File): List[String] = {
        Source.fromFile(file).getLines.toList
    }

    def fileLineLengthSuffix(end: String): Array[Int] = {
        val filesList = new File("D:\\code\\phpStudy2018\\PHPTutorial\\WWW\\phpRedisAdmin").listFiles
        for {
            file <- filesList
            if file.getName.endsWith(end)
            line <- fileLines(file)
            trimmed = line.trim
            if trimmed.matches(".*redis.*")
            if trimmed.length > 0
        } yield line.length
    }
}
