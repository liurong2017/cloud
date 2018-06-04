package com.qf.feignconsumer.service;

import com.qf.feignconsumer.model.User;
import org.springframework.stereotype.Component;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@Component
public class ApiFallBackService implements FeignService {

    @Override
    public String getFeign1(Integer id, String name) {
        return "error id and name ";
    }

    @Override
    public String getFeign2(Integer id) {
        return "error id";
    }

    @Override
    public String getFeign() {
        return "error";
    }

    @Override
    public String getFeign3(User user) {
        return new User(0,"error").toString();
    }
}
