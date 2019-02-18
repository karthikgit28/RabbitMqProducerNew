package com.test.rabbitmq.rabbitmqproducertest;

import java.util.Date;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.test.rabbitmq.rabbitmqproducertest.entity.Employee;
import com.test.rabbitmq.rabbitmqproducertest.producer.DirectExchangeTest;
import com.test.rabbitmq.rabbitmqproducertest.producer.FanOutExchange;
import com.test.rabbitmq.rabbitmqproducertest.producer.FixedRateProducer;
import com.test.rabbitmq.rabbitmqproducertest.producer.JsonProducer;
import com.test.rabbitmq.rabbitmqproducertest.producer.RabbitProducer;
import com.test.rabbitmq.rabbitmqproducertest.producer.TopicExchangeClass;
import com.test.rabbitmq.rabbitmqproducertest.producer.WithoutDLX;

@SpringBootApplication
@EnableScheduling
public class RabbitmqProducerTestApplication implements CommandLineRunner{

	@Autowired
	private RabbitProducer rabbitProducer;
	
	@Autowired
	private FixedRateProducer fixedRate;
	
	@Autowired
	private FanOutExchange fanout;
	
	@Autowired
	private JsonProducer json;
	
	@Autowired
	private DirectExchangeTest direct;
	
	@Autowired
	private TopicExchangeClass topic;
	
	@Autowired
	private WithoutDLX noDlx;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//rabbitProducer.sendMessage("RabbitTest " + Math.random());
		//fixedRate.sendMessage();
//		for(int i=0;i<5;i++) {
//			Employee e = new Employee("karthik "+ i,"test " + i, new Date(),"test.png");
//			//json.sendMessage(e);
//			//fanout.sendMessage(e);
//			//direct.sendMessge(e);
//			topic.sendMessge(e);
//		}
//		for(int i=0;i<5;i++) {
//			Employee e = new Employee("karthikNew "+ i,"testNew " + i, new Date(),"test.user.png");
//			//json.sendMessage(e);
//			//fanout.sendMessage(e);
//			//direct.sendMessge(e);
//			topic.sendMessge(e);
//		}
		Employee e = new Employee("karthik ","test ", new Date(),"typee");
		noDlx.sendMessage(e);
		
	}

}

