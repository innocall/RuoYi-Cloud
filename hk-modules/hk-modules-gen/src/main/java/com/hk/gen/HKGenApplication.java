package com.hk.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.hk.common.security.annotation.EnableCustomConfig;
import com.hk.common.security.annotation.EnableRyFeignClients;
import com.hk.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author wxt
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringCloudApplication
public class HKGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HKGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
