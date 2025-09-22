package com.cpf.learn.helloredis.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author cui pengfei
 * @since 17
 * Date 2025/9/22
 * Description: 测试自动装配的RedisTemplate
 */
@SpringBootTest
public class TestRedisTemplate {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("key1", "value1");
    }

    @Test
    public void test() {
        redisTemplate.opsForValue().set("name", "cpf");
        String name = redisTemplate.opsForValue().get("name");
        assertEquals("cpf", name);
        redisTemplate.delete("name");
        String deletedName = redisTemplate.opsForValue().get("name");
        assertNull(deletedName);
    }
}
