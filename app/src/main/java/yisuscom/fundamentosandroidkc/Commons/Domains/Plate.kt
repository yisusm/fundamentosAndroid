package yisuscom.fundamentosandroidkc.Commons.Domains

import java.io.Serializable

/**
 * Created by jesus on 02/12/2017.
 */
data class Plate (val id: Int,val name: String, val description: String, val price: Double, val allergens: Array<String>,val photo: String): Serializable {

    var annotations: String = ""

}