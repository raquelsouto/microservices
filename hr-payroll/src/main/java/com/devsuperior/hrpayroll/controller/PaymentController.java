package com.devsuperior.hrpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value="/{id}/days/{days}")
	public ResponseEntity<Payment> getPaymente(@PathVariable Long id, @PathVariable Integer days) {
		Payment payment = paymentService.getPayment(id, days);
		return ResponseEntity.ok(payment);
	}

}
