package com.file

import java.io.File

object FileMatcher {
    private def fileHere = new File("/home/biyuansi/code/www/redis.admin.dailence.xyz").listFiles
    private def fileMatching(matcher: String => Boolean): Iterable[String] = {
        for (file <- fileHere if matcher(file.getName))
            yield file.getName
    }
    def fileEnding(query: String): Iterable[String] = fileMatching( _.endsWith(query))
    def fileContaining(query: String): Iterable[String] = fileMatching(_ contains query)
    def fileRegex(query: String): Iterable[String] = fileMatching(_ matches query)
}
