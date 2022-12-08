package cz.edu.poc.dbshudown

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoCDbShutdownApplication

fun main(args: Array<String>) {
	runApplication<PoCDbShutdownApplication>(*args)
}
