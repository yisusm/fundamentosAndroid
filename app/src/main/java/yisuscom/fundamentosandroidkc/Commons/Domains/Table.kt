package yisuscom.fundamentosandroidkc.Commons.Domains

import java.io.Serializable

/**
 * Created by jesus on 30/11/2017.
 */
data class Table (val id: Int, val description: String): Serializable {

    private val plates: ArrayList<Plate> = ArrayList<Plate>();

    constructor(id: Int): this(id,"")

    fun addPlate (plate: Plate): Table {
        plates.add(plate)
        return this
    }

    fun getPlates (): ArrayList<Plate> {
        return plates
    }

    fun getTotalPrice (): Double {
        var totalPrice: Double = 0.0
        plates.forEach { plate ->
            totalPrice += plate.price
        }
        return totalPrice
    }

}