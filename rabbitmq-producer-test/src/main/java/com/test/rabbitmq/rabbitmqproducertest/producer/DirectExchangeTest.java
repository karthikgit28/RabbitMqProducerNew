package com.test.rabbitmq.rabbitmqproducertest.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.rabbitmq.rabbitmqproducertest.entity.Employee;

@Service
public class DirectExchangeTest {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	private ObjectMapper object = new ObjectMapper();
	
	public void sendMessge(Employee emp) {
		String str = "";
		 try {
			str = object.writeValueAsString(emp);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		rabbitTemplate.convertAndSend("x.direct","jpeg",str);
	}
	
}
