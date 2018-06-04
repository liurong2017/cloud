package com.qf.service1.controller;

import com.qf.service1.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @Created by liur.
 * @Date: 2018/5/28
 * @Description:
 */
@RestController
public class ServiceController {

    Logger logger= LoggerFactory.getLogger(ServiceController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/service1",method = RequestMethod.GET)
    public  String getServie()throws Exception{
        System.out.println("end====");
        return "hello service1";
    }
    @RequestMapping(value = "/putId",method = RequestMethod.GET)
    public  String getServie1(@RequestHeader("id") Integer id)throws Exception{
        return "ID="+id;
    }
    @RequestMapping(value = "/put",method = RequestMethod.GET)
    public  String getServie2(@RequestParam("id") Integer id,@RequestParam("name") String name)throws Exception{
        System.out.println("Id="+id+";name="+name);
        return "Id="+id+";name="+name;
    }
    @RequestMapping(value = "/putUser",method = RequestMethod.POST)
    public  String getServie3(@RequestBody User user)throws Exception{
        System.out.println(user.toString());
        return user.toString();
    }


}
