package com.iscas

import org.apache.spark.{SparkConf, SparkContext}
import redis.clients.jedis.Jedis

/**
  * @Author: lxj
  * @Date: 2019/1/22 15:18
  * @Version 1.0
  */
object InputTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("RedisTest")
    val sc = new SparkContext(conf)
    var jd = new Jedis("172.17.0.2", 7000)
    var value = jd.get("hello")
    println("redisTest")
    println("The value of hello is "+value)
    sc.stop()
  }

}
