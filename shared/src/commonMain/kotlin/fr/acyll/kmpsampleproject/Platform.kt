package fr.acyll.kmpsampleproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform