package net

import dispatch._
import util.StringUtil._


abstract sealed class HttpMethod(val name:String) {
}
object HttpMethod {
  case object GET extends HttpMethod("get")
  case object POST extends HttpMethod("post")
  case object PUT extends HttpMethod("put")
}

/**
  * APIを実行するインスタンス
  */
class API(rootUrl:String, auth:Authenticator) {

  def run(path:String, method:HttpMethod, data:Seq[(String,Any)]):Unit = {
    val req = url(joinPath(rootUrl, path)).subject.setMethod(method.name)

    data.foreach {p =>
      req.addParameter(p._1, p._2.toString)
    }

    req
  }
}
