package com.example.paymentservice.payment.adapter.`in`.web.api

import com.example.paymentservice.common.WebAdapter
import com.example.paymentservice.payment.adapter.`in`.web.request.TossPaymentConfirmRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Mono

@WebAdapter
@RequestMapping("/v1/toss")
class TossPaymentController {
    @PostMapping("/confirm")
    fun confirm(@RequestBody request: TossPaymentConfirmRequest): Mono<String> {

    }
}
