package com.qf.feignconsumer.controller;

import com.qf.feignconsumer.model.User;
import com.qf.feignconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;


    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String getFeign(){
        return feignService.getFeign();
    }

    @RequestMapping(value = "/feign-consumer1",method = RequestMethod.GET)
    public String getFeign1(@RequestHeader("id") Integer id){
        return feignService.getFeign2(id);
    }
    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String getFeign2(@RequestParam("id") Integer id, @RequestParam("name") String name){
        return feignService.getFeign1(id,name);
    }
    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.POST)
    public String getFeign3(){
        return feignService.getFeign3(new User(1,"zs111"));
    }
}
