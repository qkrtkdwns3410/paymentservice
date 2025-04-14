package com.example.paymentservice.payment.application.port.out

import com.example.paymentservice.domain.Product
import reactor.core.publisher.Flux

interface LoadProductPort {
    fun getProducts(cardId: Long, productIds: List<Long>): Flux<Product>
}
