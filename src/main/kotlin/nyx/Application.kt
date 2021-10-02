package nyx

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.request.*
import io.ktor.serialization.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import kotlinx.serialization.json.Json
import nyx.plugins.configureRouting
import org.slf4j.event.Level

fun main() {
    embeddedServer(CIO, port = System.getenv("PORT").toInt()) {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }

        install(CallLogging) {
            level = Level.INFO
            filter { call -> call.request.path().startsWith("/") }
        }

        configureRouting()
    }.start(wait = true)
}
