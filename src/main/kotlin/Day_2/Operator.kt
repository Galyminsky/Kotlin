package Day_2

fun main() {

    val hasDriverLicense = false
    val isCarWorking = false
    val isPublicTransportAvailable = false
    if (hasDriverLicense && isCarWorking && (!isPublicTransportAvailable) ) {
        println("Car")
    } else if ((!hasDriverLicense || !isCarWorking) && isPublicTransportAvailable) {
        println("PublicTransport")
    } else if ((!hasDriverLicense) && (!isCarWorking) && (!isPublicTransportAvailable)) {
        println("Way")
    }

}