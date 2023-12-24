package com.xgamma.tranquillity

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform