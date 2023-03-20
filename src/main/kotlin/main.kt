import kotlin.system.exitProcess

fun main() {
    println(discounting("MM", 100, 600000))
}

fun discounting(systems: String = "VK", oldRemittance: Int = 0, remittance: Int): Int {
    var result: Int
    if (systems == "MM") {
        if (oldRemittance + remittance < 600_000){
        if ((oldRemittance + remittance) >= 300 && (oldRemittance + remittance) <= 75000) {
            result = remittance
        } else {
            result = (remittance - (remittance * 0.075) - 20).toInt()
        }
        } else {
            println("Перелимит")
            exitProcess(0)
        }
    } else if (systems == "VM") {
        if (oldRemittance + remittance < 600_000){
        if ((remittance * 0.075).toInt() > 35) {
            result = (remittance - (remittance * 0.075)).toInt()
        } else {
            result = remittance - 35
        }
        } else {
            println("Перелимит")
            exitProcess(0)
        }
    } else {
        result = remittance
    }
    return result
}