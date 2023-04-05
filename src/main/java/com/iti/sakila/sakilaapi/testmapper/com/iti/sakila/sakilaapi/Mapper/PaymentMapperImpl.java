package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.PaymentDto;
import com.iti.sakila.sakilaapi.entity.Payment;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Payment toEntity(PaymentDto paymentDto) {
        if ( paymentDto == null ) {
            return null;
        }

        Payment payment = new Payment();

        return payment;
    }

    @Override
    public PaymentDto toDto(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentDto paymentDto = new PaymentDto();

        return paymentDto;
    }

    @Override
    public Payment partialUpdate(PaymentDto paymentDto, Payment payment) {
        if ( paymentDto == null ) {
            return payment;
        }

        return payment;
    }
}
