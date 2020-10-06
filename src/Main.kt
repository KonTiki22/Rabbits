public fun calcRabbits(months:Int, k:Int): Long {
    var prev_month1: Long = 1L
    var prev_month2: Long = 1L
    var curr_month: Long = 0L
    for (month in 2 until months) {
        curr_month = prev_month1 + prev_month2 * k
        prev_month2 = prev_month1
        prev_month1 = curr_month
    }

    return curr_month
}

fun main(args: Array<String>) {
    val months = 32
    val k = 5
    println("Число пар кроликов через $months месяца при коэффициенте размножения K = $k\nбудет равняться ${calcRabbits(months, k)}, что приведет к неминуемому кроликопокалипсису.")
}