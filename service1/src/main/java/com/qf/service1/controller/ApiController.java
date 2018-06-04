package com.qf.service1.controller;

import com.qf.feignapi.model.User;
import com.qf.feignapi.service.FeignApiService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@RestController
public class ApiController implements FeignApiService {



    @Override
    public String getFeign1(Integer id, String name) throws Exception{

        return "Id="+id+";name="+name;
    }

    @Override
    public String getFeign2(Integer id) throws Exception{
        return "Id="+id;
    }

    @Override
    public String getFeign3(User user) {
        return user.toString();
    }
}
