package ca.tcemap

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ca.tcemap.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
