fun main() {
    while (true) {
        print("\nДля выхода введите \"0\"\nВведите сумму перевода в копейках:  ")
        val amount = readLine()?.toInt() ?: return
        if (amount == 0) break
        val commission = if (amount > 35_00) amount / 10000 * 75
        else 35_00
        println("Комиссия за перевод составит $commission копеек")
    }
    println("До встречи!")
}