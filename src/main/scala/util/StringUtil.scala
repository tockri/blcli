package util

/**
  * Utility instance for string
  */
object StringUtil {
  /**
    * join
    * @param path1
    * @param path2
    * @return
    */
  def joinPath(path1:String, path2:String):String = {
    val p1 = if (path1.endsWith("/")) path1.substring(0, path1.length - 1) else path1
    val p2 = if (path2.startsWith("/")) path2.tail else path2
    s"{$p1}/{$p2}"
  }
}
