package com.payment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PixApplication

fun main(args: Array<String>) {
    runApplication<PixApplication>(*args)
}