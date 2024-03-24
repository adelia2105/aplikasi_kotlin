data class Club(
    val name: String,
    val totalPremierLeagueTrophies: Int,
    val totalFATrophies: Int,
    val totalEFLTrophies: Int,
    val totalChampionsLeagueTrophies: Int,
    val totalUEFAEuropaLeagueTrophies: Int
)

fun main() {
    val clubs = listOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 5, 3, 0),
        Club("Chelsea", 6, 8, 5, 2, 2),
        Club("Arsenal", 13, 14, 2, 0, 0)
    )

    val sortedClubs = sortClubsByTotalTrophies(clubs)
    val filteredClubs = filterClubsWithoutChampionsLeagueOrEuropaLeagueTrophies(clubs)

    println("Daftar Klub:")
    sortedClubs.forEach { println(it.name) }

    println("\nKlub yang belum pernah memenangkan trofi Liga Champions dan Liga Eropa UEFA:")
    filteredClubs.forEach { club ->
        println("${club.name} belum pernah memenangkan trofi Liga Champions dan liga Eropa UEFA")
    }
    // Memanggil extension function untuk menampilkan rekap perolehan trofi klub
    println("Daftar Klub:")
    clubs.forEach { it.printTrophySummary() }
}

fun sortClubsByTotalTrophies(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending {
        it.totalPremierLeagueTrophies + it.totalFATrophies + it.totalEFLTrophies +
                it.totalChampionsLeagueTrophies + it.totalUEFAEuropaLeagueTrophies
    }
}

fun filterClubsWithoutChampionsLeagueOrEuropaLeagueTrophies(clubs: List<Club>): List<Club> {
    return clubs.filter {
        it.totalChampionsLeagueTrophies == 0 && it.totalUEFAEuropaLeagueTrophies == 0
    }
}

// Extension function untuk menampilkan rekap perolehan trofi klub
fun Club.printTrophySummary() {
    println("$name berhasil meraih $totalPremierLeagueTrophies trofi Liga Primer Inggris, " +
            "$totalFATrophies trofi FA, $totalEFLTrophies trofi EFL, " +
            "$totalChampionsLeagueTrophies trofi Liga Champions, dan " +
            "$totalUEFAEuropaLeagueTrophies trofi Liga Eropa UEFA")
}
