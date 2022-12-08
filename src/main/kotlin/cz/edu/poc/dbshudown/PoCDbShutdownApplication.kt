package cz.edu.poc.dbshudown

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class PoCDbShutdownApplication

fun main(args: Array<String>) {
	runApplication<PoCDbShutdownApplication>(*args)
}
