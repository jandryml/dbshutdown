package cz.edu.poc.dbshudown.task

import org.springframework.boot.actuate.health.Status
import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import kotlin.system.exitProcess

@Service
class DbCheckTask(
    private val healthIndicator: DataSourceHealthIndicator
) {

    @Scheduled(fixedRate = 1000L)
    fun checkDBHealth() {
        val status = healthIndicator.health().status
        println("${LocalDateTime.now()}: Checking!")

        if (Status.UP != status) {
            println("DATABASE IS OFFLINE! SHUTTING DOWN!")
            exitProcess(1)
        }
    }
}