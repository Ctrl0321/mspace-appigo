package com.mspace.restohub.controller

import com.mspace.restohub.RestohubService
import com.mspace.restohub.model.MessageRequest
import com.mspace.restohub.model.MessageResponsive
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
@RequestMapping("/api/v1")
class RestohubController(private val service: RestohubService) {
@PostMapping("/sms/mo-receive")
fun sendMT( @RequestBody messageRequest: MessageRequest): Mono<MessageResponsive> = service.sendMessage(messageRequest)
}