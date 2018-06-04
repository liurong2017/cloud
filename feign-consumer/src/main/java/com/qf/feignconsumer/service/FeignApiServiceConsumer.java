package com.qf.feignconsumer.service;

import com.qf.feignapi.service.FeignApiService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Created by liur.
 * @Date: 2018/5/31
 * @Description:
 */
@FeignClient(name = "service1")
public interface FeignApiServiceConsumer extends FeignApiService {
}
