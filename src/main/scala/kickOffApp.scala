import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.sql.SparkSession

object kickOffApp {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").getOrCreate()
    import spark.implicits._

    val dummyDf = Seq(Array[Int](1,2,3)).toDF()
    dummyDf.show()
  }
}
