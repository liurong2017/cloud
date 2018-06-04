package com.qf.feignapi.service;

import com.qf.feignapi.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@RequestMapping("/api")
public interface FeignApiService {

    @RequestMapping(value = "/put2",method = RequestMethod.GET)
    public String getFeign1(@RequestParam("id") Integer id, @RequestParam("name") String name)throws Exception;


    @RequestMapping(value = "/putId2",method = RequestMethod.GET)
    public String getFeign2(@RequestHeader("id") Integer id)throws Exception;

    @RequestMapping(value = "/putUser2",method = RequestMethod.POST)
    public String getFeign3(@RequestBody User user)throws Exception;
}
