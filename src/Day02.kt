// https://adventofcode.com/2021/day/2
fun main() {
    fun part1(commands: List<String>): Int {
        var x = 0
        var y = 0

        commands.forEach {
            val (command, value) = it.split(" ")
            when (command) {
                "forward" -> x+= value.toInt()
                "up" -> y -= value.toInt()
                "down" -> y += value.toInt()
            }
        }

        return x * y
    }

    fun part2(commands: List<String>): Int {
        var x = 0
        var y = 0
        var aim = 0

        commands.forEach {
            val (command, value) = it.split(" ")
            when (command) {
                "forward" -> {
                    x+= value.toInt()
                    y += aim * value.toInt()
                }
                "up" -> aim -= value.toInt()
                "down" -> aim += value.toInt()
            }
        }

        return x * y
    }

    val testInput = readInput("Day02_test")
    val input = readInput("Day02")

    checkEqual(150, part1(testInput))
    println("PART 1: ${part1(input)}")

    checkEqual(900, part2(testInput))
    println("PART 2: ${part2(input)}")
}
