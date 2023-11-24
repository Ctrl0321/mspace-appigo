package com.mspace.restohub

import com.mspace.restohub.model.MessageRequest
import com.mspace.restohub.model.MessageResponsive
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.doOnError

@Service
class RestohubService(
    private var sdpClient: WebClient
) {
        init {
            sdpClient = WebClient.builder()
                .baseUrl("http://localhost:7000/sms/send").build()
        }
    fun sendMessage(messageRequest: MessageRequest): Mono<MessageResponsive> {
       return sdpClient.post()
             .accept(MediaType.APPLICATION_JSON)
             .body(BodyInserters.fromValue(messageRequest))
           .retrieve()
           .bodyToMono(MessageResponsive::class.java)
           .doOnSuccess{
               println("Success")
           }
           .doOnError{
               println("Error")
           };
    }
}