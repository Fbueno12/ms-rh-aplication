package br.com.felipebueno.hrpayroll.services;

import br.com.felipebueno.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return Payment.builder().name("bob")
                .dailyIncome(200.0).days(days).build();
    }

}
