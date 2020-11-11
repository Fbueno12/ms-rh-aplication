package br.com.felipebueno.hrpayroll.controllers;

import br.com.felipebueno.hrpayroll.entities.Payment;
import br.com.felipebueno.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
    
    @Autowired
    private PaymentService service;
    
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> findOne(@PathVariable Long workerId,
                                            @PathVariable Integer days){
        Payment payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }
    
    
}
