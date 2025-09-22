package com.cpf.learn.helloredis.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author cui pengfei
 * @since 17
 * Date 2025/9/22
 * Description: 测试自动装配的RedisTemplate
 */
@SpringBootTest
public class TestStringRedisTemplate {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("StringRedisTemplate", "StringRedisTemplateValue");
    }
}
