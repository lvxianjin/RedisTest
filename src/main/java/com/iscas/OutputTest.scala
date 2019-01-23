package com.iscas

import org.apache.spark.{SparkConf, SparkContext}
import redis.clients.jedis.Jedis

/**
  * @Author: lxj
  * @Date: 2019/1/22 15:45
  * @Version 1.0
  */
object OutputTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("RedisTest")
    val sc = new SparkContext(conf)
    var jedis = new Jedis("172.17.0.2", 7000)
    jedis.set("lv","sparkTest")
    var value = jedis.get("lv")
    println("redisTest")
    println(value)
    sc.stop()
  }

}
