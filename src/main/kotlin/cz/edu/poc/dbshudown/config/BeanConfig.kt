package cz.edu.poc.dbshudown.config

import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class BeanConfig {
    @Bean
    fun dataSourceHealthIndicator(dataSource: DataSource) =
        DataSourceHealthIndicator(dataSource, "SELECT 1;")
}