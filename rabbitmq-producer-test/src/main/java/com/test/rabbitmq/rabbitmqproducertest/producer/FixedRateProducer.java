package com.test.rabbitmq.rabbitmqproducertest.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {

	@Autowired
	private RabbitTemplate rabbitTemplae;
	
	private int i;
	
//	@Scheduled(fixedRate=500)
//	public void sendMessage() {
//		i++;
//		System.out.println("printing i***** " + i);
//		rabbitTemplae.convertAndSend("queue.fixedrate","Fixed Rate = " + i);
//	}
}
