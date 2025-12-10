package org.example

class NeighbourChecker(val grid: List<String>, var admissibles: Int = 0) {
    val gridWidth = grid.first().length

    fun countAdmissibles(): Int {
        for(row in 0..grid.size) {
            for(column in 0..gridWidth) {
                if(getValue(row, column) != "@") {
                    continue
                }

                val neighbours = getNeighbours(row, column)

                if (neighbours.count { it == "@"} < 4) {
                    println(row *gridWidth + column)
                    admissibles++
                }
            }
        }
        return admissibles
    }

        private fun getNeighbours(row: Int, column: Int): List<String> {
        return listOf(
            getValue(row - 1, column -1),
            getValue(row - 1, column),
            getValue(row - 1, column + 1),
            getValue(row, column -1),
            getValue(row, column + 1),
            getValue(row + 1, column -1),
            getValue(row + 1, column),
            getValue(row + 1, column + 1),
        )
    }

    fun getValue(row: Int, column: Int): String {
        try {
            return grid[row].substring(column, column + 1)
        } catch (_: IndexOutOfBoundsException) {
            return ""
        }
    }
}