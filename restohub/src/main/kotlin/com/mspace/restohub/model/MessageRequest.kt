package com.mspace.restohub.model

data class MessageRequest(

    val version: String,
    val applicationId: String,
    val password: String,
    val message: String,
    val destinationAddresses: List<String>,
    val sourceAddress: String,
    val deliveryStatusRequest: String,
    val encoding: String,
    val binaryHeader: String

)
