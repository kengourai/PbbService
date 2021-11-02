package com.tsmc.pbb.service

import com.tsmc.pbb.model.Constraint

interface PbbService {
    fun queryConstraint(productId: String, operationNumber: String, equipmentId: String): List<Constraint>
}

class PbbServiceImpl: PbbService {
    override fun queryConstraint(productId: String, operationNumber: String, equipmentId: String): List<Constraint> {
        TODO("Not yet implemented")
    }
}