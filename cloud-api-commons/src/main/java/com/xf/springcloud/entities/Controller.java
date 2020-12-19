package com.xf.springcloud.entities;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/aaa")
    public void jie() {
        System.out.println("我是saveb的a");
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_TOPICS_INFORM,"inform.email","消息");
    }
}
