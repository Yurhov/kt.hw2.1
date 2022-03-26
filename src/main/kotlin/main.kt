fun main() {
    print("Введите сумму перевода в копейках:  ")
    val amount = readLine()?.toUInt() ?: return
    val commission = if (amount > 35_00u) amount / 1000u * 75u
    else 35_00u
    println("Комиссия за перевод составит $commission копеек")
}