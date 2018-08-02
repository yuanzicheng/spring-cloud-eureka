package com.yuanzicheng.eurekaclientconsumer.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class TestController {
    @GetMapping("/test")
    fun test(): String? {
        val restTemplate = RestTemplate()
        return restTemplate.getForEntity("http://localhost:20001/test", String::class.java).body
    }
}