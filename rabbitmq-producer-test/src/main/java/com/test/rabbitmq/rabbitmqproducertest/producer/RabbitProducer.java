package com.test.rabbitmq.rabbitmqproducertest.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	
	public void sendMessage(String name) {
		System.out.println("Producer****test");
		rabbitTemplate.convertAndSend("test.queue","Hello " + name);
	}

}
