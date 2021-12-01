fun main() {
    fun part1(depths: List<String>): Int {
        var previousDepth = Int.MAX_VALUE
        var depthIncrements = 0

        depths.map { it.toInt() }.forEach {
            if (previousDepth < it) {
                depthIncrements++
            }
            previousDepth = it
        }

        return depthIncrements
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // TEST part 1
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    // RESULT part 1
    val input = readInput("Day01")
    println("PART 1: ${part1(input)}")

    println("PART 2: ${part2(input)}")
}
