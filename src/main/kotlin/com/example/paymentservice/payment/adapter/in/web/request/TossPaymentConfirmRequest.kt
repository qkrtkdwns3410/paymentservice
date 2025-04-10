package com.example.paymentservice.payment.adapter.`in`.web.request

class TossPaymentConfirmRequest(
    val paymentKey: String,
    val orderId: String,
    val amount: String
) {
    override fun toString(): String {
        return "TossPaymentConfirmRequest(paymentKey='$paymentKey', orderId='$orderId', amount='$amount')"
    }
}
