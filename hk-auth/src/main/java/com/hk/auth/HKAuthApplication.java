package com.hk.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.hk.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author hk
 */
@EnableRyFeignClients
@SpringCloudApplication
class HKAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HKAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
