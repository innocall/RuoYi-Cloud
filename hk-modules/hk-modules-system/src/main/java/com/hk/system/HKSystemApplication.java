package com.hk.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.hk.common.security.annotation.EnableCustomConfig;
import com.hk.common.security.annotation.EnableRyFeignClients;
import com.hk.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author wxt
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class HKSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HKSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
