package br.com.zup

import io.grpc.Status
import io.micronaut.http.HttpStatus

class ErrorMessage(
    message: String?,
    val httpStatus: HttpStatus,
    val statusGrpc:Status,

    ):RuntimeException(message) {

}