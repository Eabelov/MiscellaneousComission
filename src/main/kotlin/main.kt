fun main() {
    println(discounting("MM", 100, 600000))
}

fun discounting(systems: String, oldRemittance: Int, remittance: Int): Int {
    var result: Int
    if (systems == "MM") {
        if ((oldRemittance + remittance) >= 300 && (oldRemittance + remittance) <= 75000) {
            result = remittance
        } else {
            result = (remittance - (remittance * 0.075) - 20).toInt()
        }
    } else if (systems == "VM") {
        if ((remittance * 0.075).toInt() > 35) {
            result = (remittance - (remittance * 0.075)).toInt()
        } else {
            result = remittance - 35
        }
    } else {
        result = remittance
    }
    return result
}