package com.qf.feignconsumer.controller;

import com.qf.feignapi.model.User;
import com.qf.feignconsumer.service.FeignApiServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@RestController
public class FeignApiController {

    @Autowired
    private FeignApiServiceConsumer feignApiServiceConsumer;

    @RequestMapping(value = "/feign-consumer000",method = RequestMethod.GET)
    public String getFeign1()throws Exception{
        StringBuffer sb=new StringBuffer();
        sb.append(feignApiServiceConsumer.getFeign2(2)+"------");
        sb.append(feignApiServiceConsumer.getFeign1(1,"张三")+"------");
       sb.append(feignApiServiceConsumer.getFeign3(new User(1,"aaaa"))+"+++++++++");
       return sb.toString();
    }
}
