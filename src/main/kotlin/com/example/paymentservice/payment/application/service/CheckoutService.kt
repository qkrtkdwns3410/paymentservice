package com.example.paymentservice.payment.application.service

import com.example.paymentservice.common.UseCase
import com.example.paymentservice.domain.CheckoutResult
import com.example.paymentservice.payment.application.port.`in`.CheckoutCommand
import com.example.paymentservice.payment.application.port.`in`.CheckoutUseCase
import com.example.paymentservice.payment.application.port.out.LoadProductPort
import reactor.core.publisher.Mono

@UseCase
class CheckoutService(
    private val loadProductPort: LoadProductPort,
) : CheckoutUseCase {

    override fun checkout(checkoutCommand: CheckoutCommand): Mono<CheckoutResult> {
        //TODO Implement the checkout logic
        return Mono.just(
            CheckoutResult(
                amount = 1000L,
                orderId = "order123",
                orderName = "Sample Order"
            )
        )
    }
}
