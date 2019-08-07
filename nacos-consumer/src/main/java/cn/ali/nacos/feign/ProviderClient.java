package cn.ali.nacos.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;
/**
 * @Author: 张文斌
 * @Data: 2019/7/31 17
 * @Description:
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/hi")
    public String hi();
}
