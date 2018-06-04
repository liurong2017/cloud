package com.qf.consumer.controller;

import com.qf.consumer.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Created by liur.
 * @Date: 2018/5/28
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String getConsumer(){

        return helloService.getHello();
    }
}
