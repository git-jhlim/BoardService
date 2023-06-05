package com.solp.cloudgateway.presentation.handler

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class GatewayCheckHandler {
    private val log = LoggerFactory.getLogger(javaClass)

    suspend fun greet(request: ServerRequest): ServerResponse {
        log.info("Access / greeting")

        return ServerResponse.ok().bodyValueAndAwait("greeting!")
    }
}