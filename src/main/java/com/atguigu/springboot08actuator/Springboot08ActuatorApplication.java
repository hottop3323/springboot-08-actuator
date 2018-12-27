package com.atguigu.springboot08actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 请求 可以先配置    management.security.enabled=false
 *
 * actuator 所有Endpoint端点，需加入spring HATEOAS支持
 * autoconfig 所有自动配置信息
 * beans 所有Bean的信息
 * configprops 所有配置属性
 * dump 线程状态信息
 * env 当前环境信息
 * health 应用健康状况
 * info 当前应用信息
 * metrics 应用的各项指标
 * mappings 应用@RequestMapping映射路径
 * shutdown 关闭当前应用（默认关闭）
 * trace 追踪信息（最新的http请求）
 */

/**
 * 定制端点信息
 * – 定制端点一般通过endpoints+端点名+属性名来设置。
 * – 修改端点id（endpoints.beans.id=mybeans）
 * – 开启远程应用关闭功能（endpoints.shutdown.enabled=true）
 * – 关闭端点（endpoints.beans.enabled=false）
 * – 开启所需端点
 * • endpoints.enabled=false
 * • endpoints.beans.enabled=true
 * – 定制端点访问路径
 * • management.context-path=/manage
 * – 关闭http端点
 * • management.port=-1
 */

/**
 * 自定义状态检查器
 * 1、编写一个指示器，实现HealthIndicator
 * 2、指示器的名字 xxxHealthIndicator
 * 3、加入容器中
 */

@SpringBootApplication
public class Springboot08ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08ActuatorApplication.class, args);
    }

}

