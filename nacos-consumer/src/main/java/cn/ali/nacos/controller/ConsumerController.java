package cn.ali.nacos.controller;

import cn.ali.nacos.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 张文斌
 * @Data: 2019/7/31 17
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hiFeign(){
        return providerClient.hi();
    }

    @GetMapping("/hi/rt")
    public String restTemplate(){
        return restTemplate.getForObject("http://nacos-provider/hi",String.class);
    }
}
