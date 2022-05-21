import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

internal class Percentage_Of_A_RepititionsKtTest {

    @Test
    fun should_ReturnCorrectPercentage_When_HaveCorrectInput() {
        // given
        val characterList: List<String> = listOf("a", "a", "b", "b")
        // when calculate "a" repititions
        val percentageOf_a_Character = calculatePercentageOf_a_Repitition(characterList)
        // then check the result
        assertEquals(50.0,percentageOf_a_Character)
    }

    @Test
    fun should_ReturnMinus1_When_AnyElementLengthNotEqualOne() {
        // given
        val characterList: List<String> = listOf("ab", "aaa", "baba")
        // when calculate "a" repititions
        val percentageOf_a_Character = calculatePercentageOf_a_Repitition(characterList)
        // then check the result
        assertEquals(-1.0,percentageOf_a_Character)
    }

    @Test
    fun should_ReturnMinus1_When_AnyElementNeither_a_Nor_b() {
        // given
        val characterList: List<String> = listOf("c", "b", "i")
        // when calculate "a" repititions
        val percentageOf_a_Character = calculatePercentageOf_a_Repitition(characterList)
        // then check the result
        assertEquals(-1.0,percentageOf_a_Character)
    }
}