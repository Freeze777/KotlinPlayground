package com.playground

/**
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 */
class ExcelSheetColumn {
    fun titleToNumber(columnTitle: String): Int {
        var mul = 1
        var ans = 0
        columnTitle.reversed().forEach { c ->
            ans += (c - 'A' + 1) * mul
            mul *= 26
        }
        return ans
    }
}

fun main() {
    val sol = ExcelSheetColumn()
    println(sol.titleToNumber("A"))
    println(sol.titleToNumber("AB"))
    println(sol.titleToNumber("ZY"))
}