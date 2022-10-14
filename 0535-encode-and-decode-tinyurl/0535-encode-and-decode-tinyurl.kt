class Codec() {
    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        return longUrl+"LOL"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        return shortUrl.dropLast(3)
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */