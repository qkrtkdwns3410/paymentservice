package com.example.paymentservice.payment.application.port.`in`

import com.example.paymentservice.domain.CheckoutResult
import reactor.core.publisher.Mono

interface CheckoutUseCase {
    fun checkout(checkoutCommand: CheckoutCommand): Mono<CheckoutResult>
}
