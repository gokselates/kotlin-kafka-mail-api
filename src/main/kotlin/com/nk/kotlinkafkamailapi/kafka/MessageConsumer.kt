package com.nk.kotlinkafkamailapi.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class MessageConsumer {

    @KafkaListener(topics = arrayOf("create-customer"), groupId = "nk")
    fun listen(@Payload message: String) {
        println("Send Mail: $message")
    }
}