import java.io.File
import java.lang.IllegalStateException
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "$name.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

fun checkEqual(expected: Any, actual: Any) {
    if (expected != actual) {
        throw IllegalStateException("Expected: $expected, got: $actual")
    }
}