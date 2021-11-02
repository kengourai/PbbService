package com.tsmc.pbb.model

data class Product(val productId: String, val operations: List<Operation>)

data class Operation(val operationNumber: String,  val equipments: List<Equipment>)

data class Equipment(val equipmentId: String, val constraints: List<Constraint>)

sealed class Constraint {
    data class EquipmentStatusConstraint(val equipmentState: EquipmentState): Constraint()
    data class RecipeGroupConstraint(val recipeGroupId: String): Constraint()
}

sealed class EquipmentState {
    object EquipmentStateOn: EquipmentState()
    object EquipmentStateOff: EquipmentState()
}

