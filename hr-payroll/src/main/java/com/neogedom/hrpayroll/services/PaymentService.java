package com.neogedom.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neogedom.hrpayroll.entities.Payment;
import com.neogedom.hrpayroll.entities.Worker;
import com.neogedom.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
