import java.io._
import scala.io.Source

object Sid:
  @main
  def main(args: String*): Unit =
    /* open file */
    val filename = "/home/dedmonds/repos/sid/file.in"
    val fileContents = Source.fromFile(filename).getLines.toList

    //fileContents
    //.foreach(println)

    /* process stream */

    /* write and close file */

    def writeFile(filename: String, lines: Seq[String]): Unit =
        val file = new File(filename)
        val bw = new BufferedWriter(new FileWriter(file))
        for (line <- lines) bw.write(line + "\n")
        bw.close()

    writeFile("/home/dedmonds/repos/sid/file.out", fileContents)

    println("  done")