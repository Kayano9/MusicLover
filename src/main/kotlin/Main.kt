fun main() {
    val purchaseAmount = 1200000
    val sale = 10000
    val saleFive = 5
    val saleMusikcLover = 1
    val musikcLover: Boolean = true

    var result = if (purchaseAmount <= 100000 && purchaseAmount >= 0) {
        purchaseAmount
    } else if (purchaseAmount <= 1000000 && purchaseAmount >= 100100) {
        purchaseAmount - sale
    } else if (purchaseAmount >= 1000100) {
        purchaseAmount - (purchaseAmount * saleFive) / 100
    } else {
        0
    }

    if (musikcLover) {
        result -= (result * saleMusikcLover) / 100
    }

    println("Итоговая стоимость: " + result/100 + " руб.")
}