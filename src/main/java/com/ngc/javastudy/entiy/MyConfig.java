package com.ngc.javastudy.entiy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.entiy
 * @date 2020/3/2 2:58 下午
 */
@Configuration
public class MyConfig {

    @Bean
    public EntityBean getEntityBean(){
        return new EntityBean();
    }
}
