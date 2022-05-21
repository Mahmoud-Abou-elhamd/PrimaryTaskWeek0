import kotlin.math.roundToInt

fun main(){
    
}

fun calculatePercentageOf_a_Repitition(characterList: List<String>): Double {
    var count_a_Character = 0

    characterList.forEach {
        if(it.length != 1 || it !in "a".."b") return -1.0
        if(it == "a") count_a_Character++
    }

    val result = count_a_Character.toDouble() / characterList.size * 100
    return (result * 100.0).roundToInt() / 100.0
}
