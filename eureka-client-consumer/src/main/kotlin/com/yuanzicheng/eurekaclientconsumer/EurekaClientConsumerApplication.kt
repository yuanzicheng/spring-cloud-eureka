package com.yuanzicheng.eurekaclientconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaClientConsumerApplication

fun main(args: Array<String>) {
    runApplication<EurekaClientConsumerApplication>(*args)
}
