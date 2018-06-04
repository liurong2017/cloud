package com.qf.feignconsumer.service;

import com.qf.feignconsumer.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@FeignClient(name = "service1",fallback = ApiFallBackService.class)
public interface FeignService {

    @RequestMapping("/service1")
    public String getFeign();

    @RequestMapping(value = "/put",method = RequestMethod.GET)
    public String getFeign1(@RequestParam("id") Integer id, @RequestParam("name") String name);
    @RequestMapping(value = "/putId",method = RequestMethod.GET)
    public String getFeign2(@RequestHeader("id") Integer id);

    @RequestMapping(value = "/putUser",method = RequestMethod.POST)
    public String getFeign3(@RequestBody User user);

}
