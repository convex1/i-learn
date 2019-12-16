package utilities

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.image.ImageSchema._
import org.apache.spark.sql._


object DataOnBoard {

  def checkDimensions (dataframe: DataFrame): Long = {
    dataframe.count()
  }
}
