import java.nio.file.Paths

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.image.ImageSchema._
import org.apache.spark.sql._
import utilities.DataOnBoard._

object kickOffApp {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("SparkJob").master("local").getOrCreate()
    import spark.implicits._

    val dummyDf = Seq(Array[Int](1,2,3)).toDF()

    println(checkDimensions(dummyDf))

    //dummyDf.write.parquet("s3://")
    dummyDf.show()

  }
}
