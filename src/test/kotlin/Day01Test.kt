import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day01Test {
    val file = resource("Day01_test.txt")

    @Test
    fun part1() { assertEquals(514579, Day01.part1(file)) }

    @Test
    fun part2() { assertEquals( 241861950, Day01.part2(file)) }
}