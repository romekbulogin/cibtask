package dto

data class Billionaire(
    val id: Long = 0,
    val name: String? = "",
    val netWorth: String? = "",
    val country: String? = "",
    val source: String? = "",
    val rank: Int? = 0,
    val age: String? = "",
    val industry: String? = ""
)
