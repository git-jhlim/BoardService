package com.solp.cloudgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudGatewayApplication

fun main(args: Array<String>) {
    runApplication<CloudGatewayApplication>(*args)
}
