package com.velholeo.liracecilianaapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform