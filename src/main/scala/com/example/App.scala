package com.example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object App {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("k8s-spark")
      .getOrCreate()

    val fruits = Seq("apple", "banana", "orange", "pear", "kiwi", "pineapple", "mango", "grape", "strawberry")

    val fruitsDF = spark.createDataFrame(fruits.map(Tuple1.apply)).toDF("fruit")

    fruitsDF.show()

    spark.stop()
  }
}
