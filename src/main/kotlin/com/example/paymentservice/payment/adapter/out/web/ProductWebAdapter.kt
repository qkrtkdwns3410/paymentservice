package com.example.paymentservice.payment.adapter.out.web

import com.example.paymentservice.common.WebAdapter
import com.example.paymentservice.domain.Product
import com.example.paymentservice.payment.application.port.out.LoadProductPort
import reactor.core.publisher.Flux

@WebAdapter
class ProductWebAdapter : LoadProductPort {
    override fun getProducts(cardId: Long, productIds: List<Long>): Flux<Product> {
        TODO("Not yet implemented")
    }
}
