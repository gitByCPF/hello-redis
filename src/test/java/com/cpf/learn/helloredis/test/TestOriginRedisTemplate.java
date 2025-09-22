package com.cpf.learn.helloredis.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author cui pengfei
 * @since 17
 * Date 2025/9/22
 * Description: 测试自动装配的最原始的RedisTemplate
 * 不会按照预想的方式工作，因为没有指定序列化器，key和value都不是字符串,而是使用了JDK的序列化机制，key和value都有乱码前缀
 */
@SpringBootTest
public class TestOriginRedisTemplate {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("origin", "origin");
    }

}
