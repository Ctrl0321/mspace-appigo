package com.mspace.restohub.model


data class MessageResponsive(
val destinationResponses: List<DestinationResponse>,
val requestId: String,
val statusDetail: String,
val version: String,
val statusCode: String
)

data class DestinationResponse(
    val timeStamp: String,
    val address: String,
    val requestId: String,
    val statusDetail: String,
    val statusCode: String
)

