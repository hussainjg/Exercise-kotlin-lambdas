
//fun greetSeaCreatures(){
//    println("Hello, Deep Sea Adventurer!")
//}
//fun findPearl(number: Int): Int {
//    return number * number
//}
//fun divideTreasure(total: Double, explorers:Double): Double {
//    return total / explorers
//}
//fun calculateDepth(location1: Int, location2:Int): Int{
//    return location1 - location2
//}
//fun diveMessage(massege: String): String{
//    return load(massege)
//}
//
//fun load(massege: String): String {
//    return massege.toUpperCase() + " !"
//}

val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}

val findPearl:(Int) -> Int = {num -> num * num }

val divideTreasure: (Double, Double) -> Double = {total, explorers -> total / explorers}

fun calculateDepth (startpoint: Int, endpoint: Int, calcDepth: (Int, Int) -> Int): Int{
    return depthDiffrence(startpoint, endpoint)
}
val depthDiffrence: (Int, Int) -> Int = {startpoint, endpoint -> endpoint - startpoint}

fun load (msg: (String)): String  {
    return msg.toUpperCase() + " !"
}

val diveMessage: (String) -> String = {msg -> load(msg)}


fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    println(calculateDepth(800, 1500, depthDiffrence))
    println(diveMessage("deep sea"))
}


