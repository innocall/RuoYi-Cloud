package com.hk.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.hk.common.security.annotation.EnableCustomConfig;
import com.hk.common.security.annotation.EnableRyFeignClients;
import com.hk.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author wxt
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringCloudApplication
public class HKJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HKJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
