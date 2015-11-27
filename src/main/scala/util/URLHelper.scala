package helpers

import java.net.URLEncoder

object URLHelper {

  /**
   * Make a URL string with query parameters
   * @param base base url (may content ? and some parameters)
   * @param params parameters
   * @return URL
   */
  def build(base:String, params:Seq[(String, Any)]):String = {
    val sb = new StringBuilder(base)
    val query = params.map {case (key, value) =>
      if (value != null) {
        URLEncoder.encode(key, "utf-8") + "=" + URLEncoder.encode(value.toString, "utf-8")
      }
    }.mkString("&")
    if (query.nonEmpty) {
      if (!base.contains("?")) {
        sb.append("?")
      } else {
        sb.append("&")
      }
      sb.append(query)
    }
    sb.toString()
  }
}