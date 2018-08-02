package com.yuanzicheng.eurekaclientprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class EurekaClientProviderApplication {
    @RequestMapping("/test")
    fun test(): String{
        return "test..."
    }
}

fun main(args: Array<String>) {
    runApplication<EurekaClientProviderApplication>(*args)
}

