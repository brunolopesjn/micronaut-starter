package br.dev.profbrunolopes.micronaut.sample

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {
    @Get
    fun sayHello(): String {
        return "Hello World!"
    }
}