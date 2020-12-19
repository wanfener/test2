package com.xf.springcloud.controller;

import com.xf.springcloud.entities.RabbitmqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Mq {
    @RabbitListener(queues =  RabbitmqConfig.QUEUE_INFORM_EMAIL)
    public void t(String s) {
        System.out.println("监听到：：：："+s);
    }
}
