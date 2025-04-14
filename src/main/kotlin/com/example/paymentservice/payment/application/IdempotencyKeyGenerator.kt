package com.example.paymentservice.payment.application

import java.util.*

object IdempotencyKeyGenerator {
    fun create(data: Any): String {
        return UUID.nameUUIDFromBytes(data.toString().toByteArray()).toString()
    }
}
