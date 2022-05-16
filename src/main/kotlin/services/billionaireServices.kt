package services

import repository.billionaireRepository

class billionaireServices {

    private var billionaireRepository: billionaireRepository? = null;
    constructor() {
        billionaireRepository = billionaireRepository()
    }

    fun getBillionaire(id: Long) {
        //TODO (get Billionaire object)
    }

    fun sortingByCountry() {
        //TODO (sorting billionaire by country)
    }

    fun countryWithManyBillionaire() {
        //TODO (find country with many billionaire)
    }

    fun industriesWithManyBillionaire() {
        //TODO (find industries with many billionaire)
    }
}
