package com.gilbert.msa.service.inner.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.gilbert.msa")
@Configuration
public class FeignClientConfig {

}
