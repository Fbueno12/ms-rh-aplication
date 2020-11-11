package br.com.felipebueno.hrpayroll.services;

import br.com.felipebueno.hrpayroll.entities.Payment;
import br.com.felipebueno.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${url.hr-worker}")
    private String workerURL;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));

        Worker worker = restTemplate.getForObject(workerURL + "/workers/{id}", Worker.class, uriVariables);

        return Payment.builder().name(worker.getName())
                .dailyIncome(worker.getDailyIncome()).days(days).build();
    }

}
