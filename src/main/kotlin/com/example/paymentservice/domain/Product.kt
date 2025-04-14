package com.example.paymentservice.domain

import java.math.BigDecimal

class Product(
    val id: Long,
    val amount: BigDecimal,
    val quantity: Int,
    val name: String,
    val sellerId: Long,
)
