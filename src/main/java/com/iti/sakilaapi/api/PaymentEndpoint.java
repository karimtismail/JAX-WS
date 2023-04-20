package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.PaymentDTOReq;
import com.iti.sakilaapi.model.dto.response.PaymentDTOResp;
import com.iti.sakilaapi.service.PaymentService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class PaymentEndpoint {
    private final PaymentService paymentService;

    public PaymentEndpoint() {
        paymentService = new PaymentService();
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "getAllPayment")
    public List<PaymentDTOResp> getPaymentList() {
        return paymentService.findAll();
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "getPaymentById")
    public PaymentDTOResp getPaymentById(@WebParam(name = "paymentId") Integer paymentId) {
        return paymentService.findById(paymentId);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "createPayment")
    public PaymentDTOResp createPayment(@WebParam(name = "payment") PaymentDTOReq payment) {
        payment.setLastUpdate(Instant.now());
        payment.setPaymentDate(Instant.now());
        return paymentService.save(payment);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "updatePayment")
    public PaymentDTOResp updatePayment(@WebParam(name = "id") Integer id, @WebParam(name = "payment") PaymentDTOReq payment) throws Exception {
        payment.setLastUpdate(Instant.now());
        payment.setPaymentDate(Instant.now());
        return paymentService.update(id, payment);
    }

    @WebResult(name = "Payment")
    @WebMethod(operationName = "deletePaymentById")
    public PaymentDTOResp deletePaymentById(@WebParam(name = "paymentId") Integer paymentId) throws Exception {
        return paymentService.deleteById(paymentId);
    }
}
