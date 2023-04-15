package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.PaymentDto;
import com.iti.sakilaapi.model.entity.Payment;
import com.iti.sakilaapi.service.PaymentService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class PaymentEndpoint {
    private final PaymentService paymentService;

    public PaymentEndpoint() {
        paymentService = new PaymentService(Payment.class, PaymentDto.class);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "getAllPayment")
    public List<PaymentDto> getAllPayment() {
        return paymentService.findAll();
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "getPaymentById")
    public PaymentDto getPaymentById(@WebParam(name = "paymentId") Short paymentId) {
        return paymentService.findById(paymentId);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "createPayment")
    public PaymentDto createPayment(@WebParam(name = "payment") Payment payment) {
        return paymentService.save(payment);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "updatePayment")
    public PaymentDto updatePayment(@WebParam(name = "payment") Payment payment) {
        return paymentService.update(payment);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "deletePaymentById")
    public PaymentDto deletePaymentById(@WebParam(name = "paymentId") Short paymentId) {
        return paymentService.deleteById(paymentId);
    }
}
