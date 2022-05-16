package repository

import dto.Billionaire

class billionaireRepository {
    private val billionaireList = ArrayList<Billionaire>()

    fun addBillionaire(billionaire: Billionaire) {
        billionaireList.add(billionaire)
    }
}
