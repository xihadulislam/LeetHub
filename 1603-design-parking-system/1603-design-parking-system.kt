class ParkingSystem(big: Int, medium: Int, small: Int) {
    
        var map: MutableMap<Int, Int> = mutableMapOf()
        init {
            map[1] = big
            map[2] = medium
            map[3] = small
        }

        fun addCar(carType: Int): Boolean {
            if (map[carType]!! > 0) {
                map[carType] = map[carType]!! - 1
                return true
            }

            return false
        }

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */