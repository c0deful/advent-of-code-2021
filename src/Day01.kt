// https://adventofcode.com/2021/day/1
fun main() {
    fun part1(depths: List<Int>): Int {
        var previousDepth = Int.MAX_VALUE
        var depthIncrements = 0

        depths.forEach {
            if (previousDepth < it) {
                depthIncrements++
            }
            previousDepth = it
        }

        return depthIncrements
    }

    fun part2(depths: List<Int>): Int {
        var depth1 = Int.MAX_VALUE
        var depth2 = Int.MAX_VALUE
        var depth3 = Int.MAX_VALUE
        var depthIncrements = 0

        depths.forEach {
            if (depth1 < it) {
                depthIncrements++
            }
            depth1 = depth2
            depth2 = depth3
            depth3 = it
        }

        return depthIncrements
    }

    val testInput = readInput("Day01_test").map { it.toInt() }
    val input = readInput("Day01").map { it.toInt() }

    check(part1(testInput) == 7)
    println("PART 1: ${part1(input)}")

    check(part2(testInput) == 5)
    println("PART 2: ${part2(input)}")
}
