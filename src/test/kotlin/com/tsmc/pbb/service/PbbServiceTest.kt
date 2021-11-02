package com.tsmc.pbb.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class PbbServiceTest {
    val pbbService = PbbServiceImpl()
    val productId = "TMXXXX"
    val operationNumber = "200.202"
    val equipmentId = "N9KGN"
    val expectConstraintCount = 5

    @Test
    @DisplayName("Given a equipment in specific operation of specific product, When query constraints based on given info, Then should present corresponding constraints")
    fun thenCondition() {
        val constraints = pbbService.queryConstraint(productId, operationNumber, equipmentId)
        Assertions.assertEquals(expectConstraintCount, constraints.size)
    }
}