> lrem l 0 c
(integer) 1

> lset l 2 c
"OK"

> lset l 3 d
"OK"

> llen l
(integer) 4

## redis set 命令
> sadd s 1 2 3 4 5
(integer) 5

> sadd s 1 2 3
(integer) 0

> smembers s
1) "1"
2) "2"
3) "3"
4) "4"
5) "5"

> srem s 1
(integer) 1

> spop s 2
1) "5"
2) "3"

> srandmember s 1
1) "4"

> scard s
(integer) 2

> sismember s 2
(integer) 1

> sismember s 100
(integer) 0

> sadd s1 1 2 3 5 8
(integer) 5

> sadd s2 1 3 5 7 9
(integer) 5

> sinter s1 s2
1) "1"
2) "3"
3) "5"

> sunion s1 s2
1) "1"
2) "2"
3) "3"
4) "5"
5) "7"
6) "8"
7) "9"

> sdiff s1 s2
1) "2"
2) "8"

## redis hash 命令
> hset h1 name Tom age 11 gender male
(integer) 3

> hget h1 name
"Tom"

> hdel h1 name
(integer) 1

> hlen h1
(integer) 2

> hexists h1 name
(integer) 0

> hexists h1 age
(integer) 1

> hkeys h1
1) "age"
2) "gender"

> hvals h1
1) "11"
2) "male"

> hgetall h1
1) "age"
2) "11"
3) "gender"
4) "male"

## redis sorted set 命令
> zadd z 0 0 1 1 2 2 3 3 4 4
(integer) 5

> zadd z NX 0 0
(integer) 0

> zadd z XX 0 0
(integer) 0

> zadd z XX 0 100
(integer) 0

> zadd z XX 100 0
(integer) 0

> zadd z XX CH 99 0
(integer) 1

> zadd z 0 0
(integer) 0

> zcard z
(integer) 5

> zscore z 1
"1"

> zrank z 0
(integer) 0

> zrevrank z 0
(integer) 4

> zrem z 4
(integer) 1

> zincrby z 1 3
"4"

> zrange z 0 -1
1) "0"
2) "1"
3) "2"
4) "3"

> zadd z 9 1
(integer) 0

> zrange z 0 -1
1) "0"
2) "2"
3) "3"
4) "1"

> zrange z 0 100 BYSCORE
1) "0"
2) "2"
3) "3"
4) "1"

> zrange z (0 (9 BYSCORE
1) "2"
2) "3"

> zrange z -inf +inf BYSCORE
1) "0"
2) "2"
3) "3"
4) "1"

> zrange z -inf +inf byscore limit 1 2
1) "2"
2) "3"

> zrange z -inf +inf byscore limit 1 2 withscores
1) "2"
2) "2"
3) "3"
4) "4"