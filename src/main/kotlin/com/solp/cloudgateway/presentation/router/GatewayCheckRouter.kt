package com.solp.cloudgateway.presentation.router

import com.solp.cloudgateway.presentation.handler.GatewayCheckHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class GatewayCheckRouter(
    private val handler: GatewayCheckHandler
) {

    @Bean
    fun coRouter(): RouterFunction<ServerResponse> {
        return coRouter {
            (accept(MediaType.APPLICATION_JSON) and "/greeting").nest {
                GET("", handler::greet)
            }
        }
    }
}