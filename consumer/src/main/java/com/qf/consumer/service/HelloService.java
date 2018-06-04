package com.qf.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Created by liur.
 * @Date: 2018/5/30
 * @Description:
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public  String getHello(){

        return restTemplate.getForEntity("http://SERVICE1/service1",String.class).getBody();
    }

    public String helloError(){
        return "error";
    }
}
