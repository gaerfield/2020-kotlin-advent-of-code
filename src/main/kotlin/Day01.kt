object Day01 {
    fun part1(input: List<String>): Int {
        val inputAsInts = input.map { it.toInt() }
        inputAsInts.forEachIndexed { index, value ->
            val number = inputAsInts.subList(index+1, input.size).find { value+it == 2020 }
            if(number != null)
                return value*number
        }
        throw IllegalArgumentException("No Result")
    }

    fun part2(input: List<String>): Int {
        val inputAsInts = input.map { it.toInt() }
        inputAsInts.forEachIndexed { index, first ->
            inputAsInts.subList(index+1, input.size).forEach { second ->
                inputAsInts.subList(index+2, input.size).forEach { third ->
                    if(first+second+third == 2020)
                        return first*second*third
                }
            }
        }
        throw IllegalArgumentException("No Result")
    }
}


fun main() {
    val input = resource("Day01.txt")
    println(Day01.part1(input))
    println(Day01.part2(input))
}