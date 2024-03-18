class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("Aquarium initializing")
        // Calculate volume in liters
        println("Volume: ${width * length * height / 1000} liters")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // Calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            // Adjust height basp---ed on the desired volume
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm, Length: $length cm, Height: $height cm")
        // Print the volume
        println("Volume: $volume liters")
    }
}

fun main() {
    // Build aquariums with different configurations
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // Build aquarium with fish
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()

    // Set volume directly
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}
